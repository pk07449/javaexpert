package com.pnakaj.junit.shoping.cart.mockito.external;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pankaj on 1/19/2018.
 */
@Service
public class AWSS3Service {

    @Autowired
    private AWSS3Client awss3Client;
    @Autowired
    AWSStaticCredentialsProvider awsCredentialsProvider;

    public boolean sendDataRBIS3Bucket(String data){
        AmazonS3 amazonS3Client = awss3Client.getAmazonS3Client(awsCredentialsProvider);
        amazonS3Client.putObject("rbi-bucket","account",data);
        return true;
    }
}
