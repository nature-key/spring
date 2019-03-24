package com.atjiepi.bean.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyFilterCustom implements TypeFilter {


    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        Resource resource =  metadataReader.getResource();
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        System.out.println(classMetadata.getClassName());
        if(classMetadata.getClassName().contains("on")){
            return  true;
        }

        return false;
    }
}
