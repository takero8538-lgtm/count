# MyApp

## 概要
MyAppはONNX形式の機械学習モデルを使ってAndroidアプリ上で推論を実行するサンプルプロジェクトです。

## フォルダ構成
count/
├── app/
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/com/example/myapp/ # Kotlinソースコード
│ │ │ ├── res/ # UIレイアウトや文字列リソース
│ │ │ ├── assets/ # ONNXモデルファイル
│ │ │ ├── AndroidManifest.xml # アプリの設定
├── .github/ # GitHub ActionsなどCI設定
├── build.gradle # ビルド設定ファイル
├── settings.gradle # プロジェクト設定ファイル
└── README.md # プロジェクト説明（このファイル）


## 必要環境
- Android Studio Arctic Fox 以降推奨
- JDK 11以上
- ONNX Runtime for Android（推論ライブラリ）

## 使い方
1. Android Studioでプロジェクトを開く
2. 必要に応じてONNXモデルを `app/src/main/assets/` に配置
3. 実機またはエミュレーターでアプリをビルド・実行
4. 画面の「推論開始」ボタンでONNXモデル推論を呼び出す

## ONNXモデル変換
PyTorchなどからONNX形式に変換するサンプルコードは `scripts/convert_pt_to_onnx.py` を参照してください。

## ライセンス
MIT License

---

プロジェクトやコードに関する質問はお気軽に Issue までお寄せください。
