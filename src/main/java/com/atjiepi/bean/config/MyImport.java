package com.atjiepi.bean.config;

import com.atjiepi.bean.Blue;
import com.atjiepi.bean.Color;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImport implements ImportSelector {

    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println(annotationMetadata.getClassName());
        return new String[]{"com.atjiepi.bean.Blue"};
    }
}
