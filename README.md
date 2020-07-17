# agp41-databindingcoponent-missing
A minimal example to demonstrate that the androidx.databinding.DataBindingComponent is
missing in the `debugUnitTestRuntimeClasspath` in agp 4.1-beta04. You are expected to see the
following exception when running `./gradlew :lib:testDebugUnitTest`

    org.mockito.exceptions.base.MockitoException at ExampleUnitTest.kt:12
        Caused by: java.lang.IllegalArgumentException at ExampleUnitTest.kt:12
            Caused by: java.lang.NoClassDefFoundError at ExampleUnitTest.kt:12
                Caused by: java.lang.ClassNotFoundException at ExampleUnitTest.kt:12

With some investigation, I have observed that

In AGP 4.0 `lib/build/intermediates/javac/debug/classes/` is added to runtime classpath

In AGP 4.1
`lib/build/intermediates/runtime_library_classes_jar/debug/classes.jar` was added instead, and
androidx.databinding.DataBindingComponent is missing in the classes.jar

The DataBindingComponent.class can be found in the location:
`lib/build/intermediates/javac/debug/classes/androidx/databinding/DataBindingComponent.class`

This issue happens for library modules with data binding enabled. However, if the unit test
is in the :app module, it runs totally fine.
