package org.apache.flink.fs.s3presto;
import java.net.URI;
import org.apache.hadoop.conf.Configuration;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

public class WrapperAWSCredentialsProviderChain extends DefaultAWSCredentialsProviderChain {
    public WrapperAWSCredentialsProviderChain(URI ignoredUri, Configuration ignoredConfig) {
        super();
    }
}