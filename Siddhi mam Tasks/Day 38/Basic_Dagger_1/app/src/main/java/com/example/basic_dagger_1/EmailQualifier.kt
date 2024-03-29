package com.example.basic_dagger_1

import java.lang.annotation.Documented
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier


@Qualifier    // if we have to make our annotation qualifier then we should use this
@Documented   //
@Retention(AnnotationRetention.RUNTIME)
annotation class EmailQualifier()
