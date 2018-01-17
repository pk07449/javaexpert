package com.pnakaj.junit.shoping.cart.mockito.external;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

/**
 * Created by pankaj on 1/18/2018.
 */
public class AWSS3Client {
      public AmazonS3 getAmazonS3Client(AWSStaticCredentialsProvider credentialsProvider){
        return   new AmazonS3Client(credentialsProvider);
    }
}
