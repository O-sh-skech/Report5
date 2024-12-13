# 例外処理に慣れる
- 1th commit: strにnullを代入して初期化、str.length()でjava.lang.NullPointerExceptionの発生を確認
- 2th commit: NullPointerExceptionをtry-catch構文で例外処理した
- 3th commit: 新たなコードで例外を確認、Integer.parseInt(str)にstr型の数字以外の文字を渡した
- 2th_review: catchする例外をNullPointerExceptionに変更修正した
- TestErr: TestErr.javaを用意して、IllegalArgumentExceptionのコンストラクタを用いて、用意したケースに対するエラーの種類や条件を考察するためにコードを仮実装した
