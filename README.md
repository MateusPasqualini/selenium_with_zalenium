## selenium_with_zalenium


#### Pre-requisitos

1. [Java](https://openjdk.java.net/)
2. [Selenium](https://www.seleniumhq.org/)
3. [Docker](https://www.docker.com/)
4. [Docker-compose](https://docs.docker.com/compose/)
* Docker engine rodando, versão >= 1.11.1

## Instalação:
### Clone
- Clone esse repositório via link do github ou por linha de comando:
```
$ git clone https://github.com/MateusPasqualini/selenium_with_zalenium.git
```

### Setting up Dependecies
- Para garantir que todas as dependências foram importadas faça:
```
$ mvn clean compile 
```
### Setting up Zalenium
- Para rodar os containers utilize:
```
docker-compose up --force-recreate
```
## Tests
- Para rodar os testes utilize:
```
mvn clean test
```
## Em funcionamento
* [dashboard](http://localhost:4444/dashboard): veja todas as informações agregadas depois dos testes.
<p align="center">
    <img id="dashboard" width="600" src="https://raw.githubusercontent.com/zalando/zalenium/master/docs/img/dashboard.gif" />
  </p>
  
* Testes rodando ao vivo: [http://localhost:4444/grid/admin/live](http://localhost:4444/grid/admin/live)
<p align="center">
  <img id="live-preview" width="600" src="https://raw.githubusercontent.com/zalando/zalenium/master/docs/img/live_preview.gif" />
</p>

### Informações adicionais:
Para mais informações sobre Zalenium acesse: [Zalenium](https://opensource.zalando.com/zalenium/#docker)

Documentação completa em: https://zalando.github.io/zalenium/
