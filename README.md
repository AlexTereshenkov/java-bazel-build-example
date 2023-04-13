Minimal Bazel project showing how to build a Java project with external Maven dependencies.

## Query

Show all Maven dependencies available in the repository

```
bazel query "@maven//:*"
```

Show all targets in the project

```
$ bazel query //...
```

## Build 

Build the main binary 

```
$ bazel build //src/main/java/com/example:main
$ bazel-bin/src/main/java/com/example/main
```

Build all targets

```
$ bazel build //...
```

## Test

Run all tests

```
$ bazel test //...
```

Run tests without using the cache:

```
$ bazel test --cache_test_results=no //...
```

## Coverage

Record test coverage

```

```

## Use different Java version

https://bazel.build/docs/user-manual#java_runtime_version

```
build --java_language_version=17
build --java_runtime_version=remotejdk_17
```

## Readings

* https://bazel.build/migrate/maven
* https://bazel.build/docs/bazel-and-java