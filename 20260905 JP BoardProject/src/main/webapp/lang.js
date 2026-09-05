// 多言語テキスト辞書
const i18n = {
    ko: {
        loginTitle: "로그인",
        userId: "아이디",
        userPw: "비밀번호",
        userName: "이름",
        loginBtn: "로그인",
        joinBtn: "회원가입",
        joinTitle: "회원가입",
        joinCompleteBtn: "가입완료",
        boardTitle: "📋 게시판",
        logoutBtn: "로그아웃",
        newPostBtn: "글쓰기",
        colBno: "번호",
        colTitle: "제목",
        colWriter: "작성자",
        colDate: "작성일시",
        noPosts: "등록된 게시물이 없습니다.",
        welcomeSuffix: "님 환영합니다!",
        writeTitle: "새 글 작성",
        postTitleLabel: "제목",
        postContentLabel: "내용",
        saveBtn: "저장",
        backToList: "목록으로",
        idPlaceholder: "아이디 입력",
        pwPlaceholder: "비밀번호 입력",
        namePlaceholder: "이름 입력",
        hasAccount: "이미 계정이 있으신가요?",
        noAccount: "계정이 없으신가요?",
        goToLogin: "로그인하러 가기",
        allPostsTab: "전체 글",
        myPostsTab: "내가 쓴 글"
    },
    ja: {
        allPostsTab: "すべての投稿",
        myPostsTab: "自分の投稿",
        loginTitle: "ログイン",
        userId: "ユーザーID",
        userPw: "パスワード",
        userName: "お名前",
        loginBtn: "ログイン",
        joinBtn: "新規会員登録",
        joinTitle: "会員登録",
        joinCompleteBtn: "登録完了",
        boardTitle: "📋 掲示板",
        logoutBtn: "ログアウト",
        newPostBtn: "新規投稿",
        colBno: "番号",
        colTitle: "タイトル",
        colWriter: "作成者",
        colDate: "作成日時",
        noPosts: "登録された投稿がありません。",
        welcomeSuffix: " 様、ようこそ！",
        writeTitle: "新規投稿作成",
        postTitleLabel: "タイトル",
        postContentLabel: "内容",
        saveBtn: "保存",
        backToList: "一覧へ戻る",
        idPlaceholder: "ユーザーIDを入力",
        pwPlaceholder: "パスワードを入力",
        namePlaceholder: "お名前を入力",
        hasAccount: "既にアカウントをお持ちですか？",
        noAccount: "アカウントをお持ちでないですか？",
        goToLogin: "ログインはこちら"
    }
};

// 選択言語の取得（ローカルストレージ参照・デフォルト値：ja）
let currentLang = localStorage.getItem("siteLang") || "ja";

// 画面全体への言語適用
function applyLanguage(lang) {
    currentLang = lang;
    localStorage.setItem("siteLang", lang);

    // テキスト要素の書き換え (data-i18n)
    document.querySelectorAll("[data-i18n]").forEach(elem => {
        const key = elem.getAttribute("data-i18n");
        if (i18n[lang] && i18n[lang][key]) {
            elem.innerText = i18n[lang][key];
        }
    });

    // プレースホルダーの書き換え (data-i18n-placeholder)
    document.querySelectorAll("[data-i18n-placeholder]").forEach(elem => {
        const key = elem.getAttribute("data-i18n-placeholder");
        if (i18n[lang] && i18n[lang][key]) {
            elem.placeholder = i18n[lang][key];
        }
    });

    // セレクトボックスの同期
    const selectElem = document.getElementById("langSelect");
    if (selectElem) {
        selectElem.value = lang;
    }

    // ボタンのスタイル更新（トグルボタンが存在する場合）
    const btnJa = document.getElementById("btnJa");
    const btnKo = document.getElementById("btnKo");
    if (btnJa && btnKo) {
        btnJa.classList.toggle("active", lang === "ja");
        btnKo.classList.toggle("active", lang === "ko");
    }
}

// 言語変更用共通関数
function changeLanguage(lang) {
    applyLanguage(lang);
}

// DOM読み込み完了時に実行
document.addEventListener("DOMContentLoaded", () => {
    applyLanguage(currentLang);
});