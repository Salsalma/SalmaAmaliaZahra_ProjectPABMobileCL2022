package com.salma.film

object MoviesData {
    private val moviesTitle = arrayOf(
        "Encanto",
        "Coco",
        "Frozen",
        "Frozen II",
        "Turning Red",
        "Mulan",
        "Raya and the Last Dragon",
        "Soul",
        "Finding Nemo",
        "Finding Dory",
        "Inside Out",
        "Captain America: The First Avenger",
        "Iron Man",
        "Black Widow",
        "Captain Marvel"
    )

    private val moviesGenres = arrayOf(
        "Animation, Comedy, Family, Fantasy, Musical",
        "Animation, Adventure, Comedy, Family, Fantasy, Music, Mystery",
        "Animation, Adventure, Comedy, Family, Fantasy, Musical",
        "Animation, Adventure, Comedy, Drama, Family, Fantasy, Musical",
        "Animation, Adventure, Comedy, Family, Fantasy",
        "Action, Adventure, Drama, Fantasy",
        "Animation, Action, Adventure, Comedy, Drama, Family, Fantasy",
        "Animation, Adventure, Comedy, Drama, Family, Fantasy, Music",
        "Animation, Adventure, Comedy, Family",
        "Animation, Adventure, Comedy, Family",
        "Animation, Adventure, Comedy, Drama, Family, Fantasy",
        "Action, Adventure, Sci-Fi",
        "Action, Adventure, Sci-Fi",
        "Action, Adventure, Sci-Fi",
        "Action, Adventure, Sci-Fi"
    )

    private val moviesRate= arrayOf(
        "7.2",
        "8.4",
        "7.4",
        "6.8",
        "7.0",
        "5.7",
        "7.3",
        "8.0",
        "8.2",
        "7.3",
        "8.2",
        "6.9",
        "7.9",
        "6.7",
        "6.8"
    )

    private val moviesDetails = arrayOf(
        "Encanto menceritakan kisah keluarga Madrigal yang tinggal tersembunyi di pegunungan Kolombia, di tempat yang menakjubkan dan mempesona yang disebut Encanto. Keajaiban Encanto telah memberkati setiap anak dalam keluarga dengan hadiah unik dari kekuatan super hingga kekuatan untuk menyembuhkan. Setiap anak mendapatkan kekuatan kecuali Mirabel. Tetapi ketika dia menemukan bahwa sihir di sekitar Encanto dalam bahaya, Mirabel memutuskan bahwa dia  satu-satunya Madrigal biasa, menjadi harapan terakhir keluarganya yang luar biasa.",
        "Terlepas dari larangan bermusik di keluarganya, Miguel bermimpi menjadi musisi ulung seperti idolanya, Ernesto de la Cruz. Putus asa untuk membuktikan bakatnya, Miguel menemukan dirinya di Land of the Dead yang menakjubkan dan penuh warna. Sepanjang jalan, dia bertemu penipu menawan Hector. Bersama-sama, mereka memulai perjalanan yang luar biasa untuk membuka kisah nyata di balik sejarah keluarga Miguel.",
        "Anna bekerja sama dengan pria gunung yang kasar Kristoff dan rusa setianya Sven. Mereka memulai perjalanan epik untuk menemukan saudara perempuan Anna, yaitu Elsa. Dari luar Elsa terlihat tenang, agung dan pendiam, tetapi pada kenyataannya dia hidup dalam ketakutan dengan rahasia yang kuat: dia dilahirkan dengan kekuatan untuk menciptakan es dan salju. Ini adalah kemampuan yang indah, tetapi juga sangat berbahaya. Dihantui oleh saat sihirnya hampir membunuh adik perempuannya. Elsa telah mengisolasi dirinya sendiri, menghabiskan setiap menit bangun mencoba untuk menekan kekuatannya yang tumbuh. Emosinya yang meningkat memicu sihir, secara tidak sengaja memicu musim dingin abadi yang tidak bisa dia hentikan. Dia takut dia menjadi monster dan tidak ada seorang pun dapat membantunya.",
        "Setelah memanfaatkan kekuatannya yang terus tumbuh setelah mengangkat kutukan mengerikan dari musim dingin abadi di Frozen (2013),  Ratu Elsa sekarang memerintah kerajaan Arendelle yang damai, menikmati kehidupan yang bahagia bersama saudara perempuannya, Putri Anna. Namun, suara merdu yang hanya bisa didengar Elsa membuatnya tetap terjaga, mengundangnya ke hutan ajaib mistis yang diceritakan ayah kepada mereka sejak lama. Akhirnya, Elsa tidak dapat menolak panggilan mendebarkan dari sirene rahasia. Dia bersama dengan Anna, Kristoff, Olaf, dan Sven mengumpulkan keberanian untuk mengikuti suara itu ke tempat yang tidak diketahui. Berniat menemukan jawaban di alam berkabut abadi di hutan. Semakin banyak, ketidakseimbangan yang tidak dapat dijelaskan tidak hanya melukai kerajaannya tetapi juga suku tetangga, Northuldra. Bisakah Ratu Elsa memanfaatkan keterampilan magis legendarisnya dengan baik untuk memulihkan perdamaian dan stabilitas?",
        "Meilin adalah seorang anak berusia 13 tahun yang percaya diri. Keinginannya terbelah antara tetap menjadi putri ibunya yang berbakti atau mengikuti masa remaja yang kacau. Ibunya yang protektif, tidak pernah jauh dari putrinya. Hal ini tidak menguntungkan bagi remaja itu. Dan seolah-olah perubahan pada minat, hubungan, dan tubuhnya tidak cukup. Setiap kali Meilin terlalu bersemangat, dia berubah menjadi panda merah raksasa.",
        "Seorang gadis muda Tiongkok menyamar sebagai pejuang laki-laki untuk menyelamatkan ayahnya.",
        "Dahulu kala di dunia fantasi Kumandra, manusia dan naga hidup bersama dalam harmoni. Namun, ketika monster jahat yang dikenal sebagai Druun mengancam tanah, para naga mengorbankan diri untuk menyelamatkan umat manusia. 500 tahun kemudian, monster yang sama telah kembali. Seorang pejuang tunggal, melacak naga terakhir dan menghentikan Druun untuk selamanya.",
        "Joe adalah seorang guru band sekolah menengah yang hidupnya belum berjalan seperti yang dia harapkan. Gairah sejatinya adalah jazz. Tetapi ketika dia melakukan perjalanan ke alam lain untuk membantu seseorang menemukan hasrat mereka, dia segera menemukan apa artinya memiliki jiwa.",
        "Seekor ikan badut bernama Marlin yang tinggal di Great Barrier Reef kehilangan putranya yang bernama Nemo setelah dia menjelajah ke laut lepas. Meskipun ayahnya terus-menerus memperingatkan tentang banyak bahaya laut. Nemo diculik oleh perahu dan dijaring dan dikirim ke kantor dokter gigi di Sydney. Sementara Marlin memberanikan diri untuk mencoba mengambil Nemo. Marlin bertemu dengan seekor ikan bernama Dory yang menderita kehilangan ingatan jangka pendek. Mereka menempuh jarak yang sangat jauh, bertemu dengan berbagai makhluk laut berbahaya seperti hiu, anglerfish, dan ubur-ubur, untuk menyelamatkan Nemo dari kantor dokter gigi, yang terletak di dekat Sydney Harbour. Sementara keduanya mencari lautan jauh dan luas, Nemo dan hewan laut lainnya di tangki ikan dokter gigi merencanakan cara untuk kembali ke laut untuk menjalani hidup mereka dengan bebas lagi.",
        "Dory adalah ikan tang biru bermata lebar yang menderita kehilangan ingatan setiap 10 detik atau lebih. Satu hal yang dapat dia ingat adalah bahwa dia entah bagaimana menjadi terpisah dari orang tuanya sebagai seorang anak. Dengan bantuan dari teman-temannya Nemo dan Marlin, Dory memulai petualangan epik untuk menemukan mereka. Perjalanannya membawanya ke Marine Life Institute, sebuah konservatori yang menampung beragam spesies laut.",
        "Tumbuh dewasa bisa menjadi jalan bergelombang, dan tidak terkecuali bagi Riley yang dicabut dari kehidupan Midwest-nya ketika ayahnya memulai pekerjaan baru di San Francisco. Seperti kita semua, Riley dibimbing oleh emosinya. Emosi tinggal di Markas Besar, pusat kendali di dalam pikiran Riley, di mana mereka membantu menasihatinya melalui kehidupan sehari-hari. Saat Riley dan emosinya berjuang untuk menyesuaikan diri dengan kehidupan baru di San Francisco, kekacauan terjadi di Markas Besar. Meskipun Joy, emosi utama dan terpenting Riley, mencoba menjaga hal-hal positif, emosi bertentangan tentang cara terbaik untuk menavigasi kota, rumah, dan sekolah baru.",
        "Ini tahun 1942, Amerika telah memasuki Perang Dunia II, Steve Rogers frustrasi karena ditolak lagi untuk dinas militer. Semuanya berubah ketika Dr. Erskine merekrutnya untuk Project Rebirth rahasia. Membuktikan keberanian, kecerdasan, dan hati nuraninya yang luar biasa, Rogers menjalani eksperimen dan tubuhnya yang lemah tiba-tiba ditingkatkan menjadi potensi manusia yang maksimal. Ketika Dr. Erskine kemudian segera dibunuh oleh agen departemen penelitian HYDRA rahasia Nazi Jerman (dipimpin oleh Johann Schmidt, alias Tengkorak Merah), Rogers dibiarkan sebagai pria unik yang awalnya disalahgunakan sebagai maskot propaganda. Namun, ketika rekan-rekannya membutuhkannya, Rogers melakukan petualangan yang sukses yang benar-benar membuatnya menjadi Captain America, dan perangnya melawan Schmidt dimulai.",
        "Tony Stark. Jenius, miliarder, playboy, dermawan. Putra penemu legendaris dan kontraktor senjata Howard Stark. Ketika Tony Stark ditugaskan untuk memberikan presentasi senjata kepada unit Irak yang dipimpin oleh Letnan Kolonel James Rhodes, dia diberi tumpangan di garis musuh. Perjalanan itu berakhir buruk ketika Humvee Stark yang dia tumpangi diserang oleh kombatan musuh. Dia selamat dengan dada penuh pecahan peluru dan aki mobil yang melekat di hatinya. Untuk bertahan hidup, dia menemukan cara untuk membuat miniatur baterai dan mengetahui bahwa baterai dapat memberi daya pada sesuatu yang lain. Maka lahirlah Iron Man. Dia menggunakan perangkat primitif untuk melarikan diri dari gua di Irak. Begitu kembali ke rumah, dia kemudian mulai bekerja untuk menyempurnakan setelan Iron Man. Tetapi pria yang bertanggung jawab atas Stark Industries memiliki rencananya sendiri untuk mengambil alih teknologi Tony untuk hal-hal lain.",
        "Natasha Romanoff alias Black Widow menghadapi bagian yang lebih gelap dari buku besarnya ketika konspirasi berbahaya yang berhubungan dengan masa lalunya muncul. Dikejar oleh kekuatan yang tidak akan berhenti untuk menjatuhkannya, Natasha harus berurusan dengan sejarahnya sebagai mata-mata dan hubungan yang rusak yang tersisa di belakangnya jauh sebelum dia menjadi Avenger.",
        "Setelah menabrakkan pesawat eksperimental, pilot Angkatan Udara Carol Danvers ditemukan oleh Kree dan dilatih sebagai anggota Militer Starforce elit di bawah komando mentornya Yon-Rogg. Enam tahun kemudian, setelah melarikan diri ke Bumi saat diserang oleh Skrull, Danvers mulai menemukan ada lebih banyak hal di masa lalunya. Dengan bantuan dari agen S.H.I.E.L.D. Nick Fury, mereka berangkat untuk mengungkap kebenaran."
    )

    private val moviesImages = intArrayOf(
        R.drawable.encanto,
        R.drawable.coco,
        R.drawable.frozen,
        R.drawable.frozen_ii,
        R.drawable.turning_red,
        R.drawable.mulan,
        R.drawable.raya_and_the_last_dragon,
        R.drawable.soul,
        R.drawable.finding_nemo,
        R.drawable.finding_dory,
        R.drawable.inside_out,
        R.drawable.captain_america_the_first_avenger,
        R.drawable.iron_man,
        R.drawable.black_widow,
        R.drawable.captain_marvel,
    )

    val listData : ArrayList<Movies>
    get() {
        val list = arrayListOf<Movies>()
        for (position in moviesTitle.indices){
            val movies = Movies()
            movies.title = moviesTitle[position]
            movies.genre = moviesGenres[position]
            movies.rate = moviesRate[position]
            movies.detail = moviesDetails[position]
            movies.photo = moviesImages[position]
            list.add(movies)
        }
        return list
    }
}