package com.jenkins_project.demo_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = "/", produces = "text/html")
    public String getPage() {
        return """
                    <!DOCTYPE html>
                    <html>
                    <head>
                        <title>Jenkins CI/CD Demo</title>
                        <style>
                            body {
                                margin: 0;
                                padding: 0;
                                font-family: Arial, sans-serif;
                                background: linear-gradient(to right, #667eea, #764ba2);
                                display: flex;
                                justify-content: center;
                                align-items: center;
                                height: 100vh;
                                color: white;
                            }
                            .card {
                                background: rgba(255, 255, 255, 0.1);
                                padding: 40px;
                                border-radius: 15px;
                                text-align: center;
                                box-shadow: 0 8px 20px rgba(0,0,0,0.3);
                                backdrop-filter: blur(10px);
                            }
                            h1 {
                                margin-bottom: 15px;
                                font-size: 36px;
                            }
                            p {
                                font-size: 18px;
                                margin-bottom: 20px;
                            }
                            .badge {
                                display: inline-block;
                                padding: 8px 15px;
                                background: #00ffcc;
                                color: black;
                                border-radius: 20px;
                                font-weight: bold;
                            }
                        </style>
                    </head>
                    <body>
                        <div class="card">
                            <h1>🚀 Jenkins CI/CD Success</h1>
                            <p>Hello Deepak, your Spring Boot app is successfully deployed!</p>
                            <span class="badge">Status: Running on Port 9090</span>
                        </div>
                    </body>
                    </html>
                """;
    }
}