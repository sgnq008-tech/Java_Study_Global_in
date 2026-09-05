// 多言語辞書オブジェクト (日本語 / 韓国語 / 英語)
const i18n = {
    ja: {
        siteBrand: "🎬 アニログ (AniLog)",
        loginTitle: "ログイン",
        userId: "ユーザーID",
        userPw: "パスワード",
        userName: "お名前",
        loginBtn: "ログイン",
        joinBtn: "新規会員登録",
        joinTitle: "会員登録",
        joinCompleteBtn: "登録完了",
        boardTitle: "🍿 アニメ感想・評価コミュニティ",
        logoutBtn: "ログアウト",
        newPostBtn: "レビュー作成",
        colBno: "番号",
        colAnime: "作品名",
        colRating: "評価",
        colTitle: "レビュータイトル",
        colWriter: "投稿者",
        colDate: "投稿日",
        noPosts: "登録されたアニメレビューがありません。",
        welcomeSuffix: " 様、ようこそ！",
        writeTitle: "アニメの感想・レビュー投稿",
        animeTitleLabel: "アニメ作品名",
        ratingLabel: "評価（星評価）",
        postTitleLabel: "レビュータイトル",
        postContentLabel: "感想・レビュー本文",
        saveBtn: "レビュー登録",
        backToList: "一覧へ戻る",
        allPostsTab: "すべてのレビュー",
        myPostsTab: "自分のレビュー",
        idPlaceholder: "ユーザーIDを入力",
        pwPlaceholder: "パスワードを入力",
        namePlaceholder: "お名前を入力",
        animePlaceholder: "例：呪術廻戦、僕のヒーローアカデミア、ガンダム",
        postTitlePlaceholder: "レビューの要約やタイトルを入力",
        postContentPlaceholder: "アニメの感想や考察を自由に入力してください",
        hasAccount: "既にアカウントをお持ちですか？",
        noAccount: "アカウントをお持ちでないですか？",
        goToLogin: "ログインはこちら",
        rating5: "★★★★★ (5点 - 最高)",
        rating4: "★★★★☆ (4点 - 良い)",
        rating3: "★★★☆☆ (3点 - 普通)",
        rating2: "★★☆☆☆ (2点 - 微妙)",
        rating1: "★☆☆☆☆ (1点 - 不満)"
    },
    ko: {
        siteBrand: "🎬 애니로그 (AniLog)",
        loginTitle: "로그인",
        userId: "아이디",
        userPw: "비밀번호",
        userName: "이름",
        loginBtn: "로그인",
        joinBtn: "회원가입",
        joinTitle: "회원가입",
        joinCompleteBtn: "가입완료",
        boardTitle: "🍿 애니 감상평 & 리뷰 커뮤니티",
        logoutBtn: "로그아웃",
        newPostBtn: "리뷰 작성",
        colBno: "번호",
        colAnime: "작품명",
        colRating: "평점",
        colTitle: "리뷰 제목",
        colWriter: "작성자",
        colDate: "작성일",
        noPosts: "등록된 애니 리뷰가 없습니다.",
        welcomeSuffix: "님 환영합니다!",
        writeTitle: "애니메이션 감상평 남기기",
        animeTitleLabel: "애니메이션 제목",
        ratingLabel: "평점 (별점)",
        postTitleLabel: "리뷰 제목",
        postContentLabel: "감상 후기 및 의견",
        saveBtn: "리뷰 등록",
        backToList: "목록으로",
        allPostsTab: "전체 리뷰",
        myPostsTab: "내가 쓴 리뷰",
        idPlaceholder: "아이디 입력",
        pwPlaceholder: "비밀번호 입력",
        namePlaceholder: "이름 입력",
        animePlaceholder: "예: 주술회전, 나의 히어로 아카데미아, 건담",
        postTitlePlaceholder: "리뷰 요약이나 한 줄 평가를 입력하세요",
        postContentPlaceholder: "애니메이션 감상평이나 의견을 자유롭게 작성해 주세요",
        hasAccount: "이미 계정이 있으신가요?",
        noAccount: "계정이 없으신가요?",
        goToLogin: "로그인하러 가기",
        rating5: "★★★★★ (5점 - 최고)",
        rating4: "★★★★☆ (4점 - 추천)",
        rating3: "★★★☆☆ (3점 - 보통)",
        rating2: "★★☆☆☆ (2점 - 아쉬움)",
        rating1: "★☆☆☆☆ (1점 - 비추천)"
    },
    en: {
        siteBrand: "🎬 AniLog",
        loginTitle: "Sign In",
        userId: "Username",
        userPw: "Password",
        userName: "Full Name",
        loginBtn: "Sign In",
        joinBtn: "Create Account",
        joinTitle: "Sign Up",
        joinCompleteBtn: "Register",
        boardTitle: "🍿 Anime Reviews & Ratings Community",
        logoutBtn: "Sign Out",
        newPostBtn: "Write Review",
        colBno: "No.",
        colAnime: "Anime Title",
        colRating: "Rating",
        colTitle: "Review Title",
        colWriter: "Author",
        colDate: "Date",
        noPosts: "No anime reviews found.",
        welcomeSuffix: ", welcome!",
        writeTitle: "Leave an Anime Review",
        animeTitleLabel: "Anime Title",
        ratingLabel: "Rating",
        postTitleLabel: "Review Title",
        postContentLabel: "Thoughts & Feedback",
        saveBtn: "Post Review",
        backToList: "Back to List",
        allPostsTab: "All Reviews",
        myPostsTab: "My Reviews",
        idPlaceholder: "Enter Username",
        pwPlaceholder: "Enter Password",
        namePlaceholder: "Enter Full Name",
        animePlaceholder: "e.g., Jujutsu Kaisen, My Hero Academia, Gundam",
        postTitlePlaceholder: "Enter a brief summary or title for your review",
        postContentPlaceholder: "Share your honest impressions and opinions about the anime",
        hasAccount: "Already have an account?",
        noAccount: "Don't have an account?",
        goToLogin: "Sign In here",
        rating5: "★★★★★ (5 Stars - Masterpiece)",
        rating4: "★★★★☆ (4 Stars - Great)",
        rating3: "★★★☆☆ (3 Stars - Average)",
        rating2: "★★☆☆☆ (2 Stars - Mediocre)",
        rating1: "★☆☆☆☆ (1 Star - Poor)"
    }
};

// 現在選択されている言語（保存値、デフォルト：日本語）
let currentLang = localStorage.getItem("siteLang") || "ja";

// 画面全体の多言語テキスト・プレースホルダー反映処理
function applyLanguage(lang) {
    currentLang = lang;
    localStorage.setItem("siteLang", lang);

    // テキスト要素 (data-i18n)
    document.querySelectorAll("[data-i18n]").forEach(el => {
        const key = el.getAttribute("data-i18n");
        if (i18n[lang] && i18n[lang][key]) {
            el.innerText = i18n[lang][key];
        }
    });

    // プレースホルダー (data-i18n-placeholder)
    document.querySelectorAll("[data-i18n-placeholder]").forEach(el => {
        const key = el.getAttribute("data-i18n-placeholder");
        if (i18n[lang] && i18n[lang][key]) {
            el.placeholder = i18n[lang][key];
        }
    });

    // ドロップダウンのオプション項目 (data-i18n-opt)
    document.querySelectorAll("[data-i18n-opt]").forEach(el => {
        const key = el.getAttribute("data-i18n-opt");
        if (i18n[lang] && i18n[lang][key]) {
            el.innerText = i18n[lang][key];
        }
    });

    // 言語ボタングループのアクティブスタイル更新
    const btnJa = document.getElementById("btnJa");
    const btnKo = document.getElementById("btnKo");
    const btnEn = document.getElementById("btnEn");
    if (btnJa) btnJa.classList.toggle("active", lang === "ja");
    if (btnKo) btnKo.classList.toggle("active", lang === "ko");
    if (btnEn) btnEn.classList.toggle("active", lang === "en");
}

function changeLanguage(lang) {
    applyLanguage(lang);
}

document.addEventListener("DOMContentLoaded", () => {
    applyLanguage(currentLang);
});