# これはなに
TestContainersを利用してITを実行するための最小構成
あとDBのmigrationってflyway使わずにいい感じ煮できないかなーって遊んでる

# Usage

## 実行環境
adoptopenjdk-jre-17.0.4+101
sbt


## TestContainersの動作確認
```
sbt test
```

## migrate
```
docker-compose up -d
sbt migrate
```
