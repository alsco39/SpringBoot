object Dependencies {

    //validation
    const val VALIDATION = "org.springframework.boot:spring-boot-starter-validation"

    //security
    const val SECURITY = "org.springframework.boot:spring-boot-starter-security"

    //web
    const val WEB = "org.springframework.boot:spring-boot-starter-web"

    // jpa
    const val JPA = "org.springframework.boot:spring-boot-starter-data-jpa"

    // queryDSL
    const val QUERYDSL = "com.querydsl:querydsl-jpa:${DependencyVersions.QUERYDSL}"
    const val QUERYDSL_PROCESSOR = "com.querydsl:querydsl-apt:${DependencyVersions.QUERYDSL}:jpa"

    // database
    const val MYSQL = "mysql:mysql-connector-java"
}