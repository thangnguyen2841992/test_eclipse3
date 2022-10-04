package com.directory.model.dto;

public class VocabularyForm {
	 @SuppressWarnings("unused")
	private String hiragana;

	    @SuppressWarnings("unused")
		private String katakana;

	    private String kanji;

	    @SuppressWarnings("unused")
		private String translation;

	    @SuppressWarnings("unused")
		private String spell;

	    @SuppressWarnings("unused")
		private String vietnameseChinese;

	    @SuppressWarnings("unused")
		private Long userId;

	    @SuppressWarnings("unused")
		private Long bookId;

	    @SuppressWarnings("unused")
		private Long lessonId;

		public VocabularyForm(String hiragana, String katakana, String kanji, String translation, String spell,
				String vietnameseChinese, Long userId, Long bookId, Long lessonId) {
			this.hiragana = hiragana;
			this.katakana = katakana;
			this.kanji = kanji;
			this.translation = translation;
			this.spell = spell;
			this.vietnameseChinese = vietnameseChinese;
			this.userId = userId;
			this.bookId = bookId;
			this.lessonId = lessonId;
		}

		public VocabularyForm() {
	
		}

		public String getHiragana() {
			return hiragana;
		}

		public void setHiragana(String hiragana) {
			this.hiragana = hiragana;
		}

		public String getKatakana() {
			return katakana;
		}

		public void setKatakana(String katakana) {
			this.katakana = katakana;
		}

		public String getKanji() {
			return kanji;
		}

		public void setKanji(String kanji) {
			this.kanji = kanji;
		}

		public String getTranslation() {
			return translation;
		}

		public void setTranslation(String translation) {
			this.translation = translation;
		}

		public String getSpell() {
			return spell;
		}

		public void setSpell(String spell) {
			this.spell = spell;
		}

		public String getVietnameseChinese() {
			return vietnameseChinese;
		}

		public void setVietnameseChinese(String vietnameseChinese) {
			this.vietnameseChinese = vietnameseChinese;
		}

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public Long getBookId() {
			return bookId;
		}

		public void setBookId(Long bookId) {
			this.bookId = bookId;
		}

		public Long getLessonId() {
			return lessonId;
		}

		public void setLessonId(Long lessonId) {
			this.lessonId = lessonId;
		}
	    
	    
}
