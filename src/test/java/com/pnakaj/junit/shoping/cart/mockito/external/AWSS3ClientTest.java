package com.pnakaj.junit.shoping.cart.mockito.external;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Created by pankaj on 1/18/2018.
 */
@RunWith(MockitoJUnitRunner.class)
public class AWSS3ClientTest {

    @Mock
    private AWSStaticCredentialsProvider awsStaticCredentialsProvider;

    @InjectMocks
    private AWSS3Client awss3Client;

    @Test
    public void name() throws Exception {

        AmazonS3 amazonS3Client = awss3Client.getAmazonS3Client(awsStaticCredentialsProvider);
        amazonS3Client.getRegion();

    }
}