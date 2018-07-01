package com.pnakaj.assignment;

import org.springframework.util.StopWatch;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.concurrent.CompletableFuture.allOf;
import static java.util.concurrent.CompletableFuture.supplyAsync;

/**
 * Created by pankaj on 6/30/2018.
 */
public class TIAAssignment {

    public static void main(String[] args) throws Exception {

        AtomicInteger machineRawMaterial = new AtomicInteger(3);
        AtomicInteger boltRawMaterial = new AtomicInteger(6);
        AtomicInteger totalTimeToBeTaken = new AtomicInteger(60000);

        List<AtomicInteger> rawMaterials = asList(machineRawMaterial, boltRawMaterial, totalTimeToBeTaken);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        CompletableFuture<String>[] totalNoOfProducts = getTotalNoOfProducts(machineRawMaterial, rawMaterials);
        allOf(totalNoOfProducts).thenAccept(e -> {
            stopWatch.stop();
            System.out.println("task Compeleted");
            System.out.println(stopWatch.getTotalTimeSeconds());
        }).get();


        Stream.of(totalNoOfProducts).forEach(prod -> {
            System.out.println(prod.join());
        });

    }

    private static CompletableFuture<String>[] getTotalNoOfProducts(AtomicInteger machineRawMaterial, List<AtomicInteger> rawMaterials) {
        CompletableFuture<String>[] noOfProducts = new CompletableFuture[machineRawMaterial.get()];
        IntStream.range(0, machineRawMaterial.get()).forEach(index -> {
            noOfProducts[index] = supplyAsync(() -> createOneProduct(rawMaterials));
        });
        return noOfProducts;
    }

    private static String createOneProduct(List<AtomicInteger> rawMaterials) {
        AtomicInteger machineRawMaterial = rawMaterials.get(0);
        AtomicInteger firstBoltRawMaterial = rawMaterials.get(1);

        CompletableFuture<Integer> machinePickerWorker = createWorker(machineRawMaterial);
        CompletableFuture<Integer> boltsFirstPickerWorker = createWorker(firstBoltRawMaterial);
        CompletableFuture<Integer> boltsSecondPickerWorker = createWorker(firstBoltRawMaterial);

        CompletableFuture<String> product = allOf(machinePickerWorker, boltsFirstPickerWorker, boltsSecondPickerWorker).thenApply(e -> {
            try {
                Thread.sleep(rawMaterials.get(2).get());
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            return "" + machinePickerWorker.join().intValue() + " - " + boltsFirstPickerWorker.join().intValue() + " -- " + boltsSecondPickerWorker.join().intValue();
        });
        try {
            return product.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return "";
    }

    private static CompletableFuture<Integer> createWorker(AtomicInteger atomicInteger) {
        return supplyAsync(() -> {
            int rawMachine = atomicInteger.get();
            atomicInteger.set(atomicInteger.get() - 1);
            return rawMachine;
        });
    }
}
