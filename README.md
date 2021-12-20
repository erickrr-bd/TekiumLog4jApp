# TekiumLog4jApp v1.0

Author: Erick Rodríguez 

Email: erickrr.tbd93@gmail.com, erodriguez@tekium.mx

License: GPLv3

Application developed in Java that simulates an application vulnerable to CVE-2021-44228. 

It uses Log4j 2.11.1 and JDK 1.8.0_181.

# Running

Run it:

`docker run --name tekiumlog4japp -p 8080:8080 d0ck3rt3k1umhub/tekiumlog4japp:v1`

Build the Docker image by yourself:

`docker build . -t tekiumlog4japp`

`docker run -p 8080:8080 --name tekiumlog4japp tekiumlog4japp`

# Exploitation Steps

<i>Note: This project is inspired by the <a href="https://github.com/christophetd/log4shell-vulnerable-app">christophetd</a> project.</i>

# Commercial Support
![Tekium](https://github.com/unmanarc/uAuditAnalyzer2/blob/master/art/tekium_slogo.jpeg)

Tekium is a cybersecurity company specialized in red team and blue team activities based in Mexico, it has clients in the financial, telecom and retail sectors.

Tekium is an active sponsor of the project, and provides commercial support in the case you need it.

For integration with other platforms such as the Elastic stack, SIEMs, managed security providers in-house solutions, or for any other requests for extending current functionality that you wish to see included in future versions, please contact us: info at tekium.mx

For more information, go to: https://www.tekium.mx/

