load("@rules_java//java:defs.bzl", "java_binary")

package(default_visibility = ["//visibility:public"])

java_binary(
    name = "main",
    srcs = ["Main.java"],
    main_class = "com.example.Main",
    deps = [":greeter"],
)

java_library(
    name = "greeter",
    srcs = ["Greeting.java"],
    deps = ["@maven//:org_apache_commons_commons_lang3_3_12_0"],
)
