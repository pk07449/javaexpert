package com.pnakaj.junit.shoping.cart.mockito.external;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Created by pankaj on 1/19/2018.
 */
@RunWith(MockitoJUnitRunner.class)
public class AWSS3ServiceTest {

    @InjectMocks
    private AWSS3Service awss3Service;
    @Mock
    private AWSStaticCredentialsProvider awsStaticCredentialsProvider;
    @Mock
    private AWSS3Client awss3Client;
    @Mock
    private String bucketName;
    @Mock
    private String keyName;


    @Test
    public void uploadDataIntoS3Bucket() throws Exception {

        awss3Service.sendDataRBIS3Bucket("anyData");

    }
}