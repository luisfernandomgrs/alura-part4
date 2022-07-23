package com.luisf.demo.alura.api;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguagesController {

        private List<Language> languages = List.of(
                        new Language("1", "c",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/c/c_256x256.png",
                                        "10.0"),
                        new Language("2", "csharp",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/csharp/csharp_256x256.png",
                                        "7.0"),
                        new Language("3", "css",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/css/css_256x256.png",
                                        "9.0"),
                        new Language("4", "go-old",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/go-old/go-old_256x256.png",
                                        "6.8"),
                        new Language("5", "go",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/go/go_256x256.png",
                                        "8.0"),
                        new Language("6", "haskell",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/haskell/haskell_256x256.png",
                                        "7.0"),
                        new Language("7", "html",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/html/html_256x256.png",
                                        "9.6"),
                        new Language("8", "java",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png",
                                        "9.0"),
                        new Language("9", "javascript",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/javascript/javascript_256x256.png",
                                        "9.0"),
                        new Language("10", "kotlin",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/kotlin/kotlin_256x256.png",
                                        "9.0"),
                        new Language("11", "lua",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/lua/lua_256x256.png",
                                        "7.0"),
                        new Language("12", "php",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png",
                                        "9.0"),
                        new Language("13", "python",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/python/python_256x256.png",
                                        "8.5"),
                        new Language("14", "r",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/r/r_256x256.png",
                                        "5.0"),
                        new Language("15", "ruby",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/ruby/ruby_256x256.png",
                                        "6.0"),
                        new Language("16", "swift",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/swift/swift_256x256.png",
                                        "7.0"),
                        new Language("17", "typescript",
                                        "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/typescript/typescript_256x256.png",
                                        "9.0"));

        @GetMapping("/languages")
        public List<Language> getLanguages() {
                return languages;
        }
}
