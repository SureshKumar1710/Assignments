const songs = [
    {
        title: "New York Nagaram",
        src: "New York Nagaram.mp3",
        cover: "New york nagaram.jpeg"
    },
    {
        title: "Hey Minnale",
        src: "Hey Minnale.mp3",
        cover:"Hey Minnale.jpg"
    },
    {
        title: "Venmathi Venmathiye",
        src: "Venmathi.mp3",
        cover:"venmathi.jpg"
    },
    {
        title: "Pookal Pookum tharunam",
        src: "Pookal Pookum.mp3",
        cover:"Madarasapattinam.jpeg"
    },
    {
        title: "Usure Poguthu",
        src: "Usurae Poguthey.mp3",
        cover:"Usure Poguthe.jpg"
    },
    {
        title: "Ayyayo Nenju",
        src: "Ayyayo Nenju.mp3",
        cover:"Ayyayo Nenju.jpg"
    },
    {
        title: "Ava Enna",
        src: "anjala.mp3",
        cover:"anjala.jpg"
    },
    {
        title: "Venmegam",
        src: "Venmegam.mp3",
        cover:"Venmegam.jpg"
    },
    {
        title: "Idhalin oru oram",
        src: "3.mp3",
        cover:"3.jpg"
    },
    {
        title: "Kadhaippoma",
        src: "omg.mp3",
        cover:"omg.jpeg"
    }
];

let currentSongIndex = 0;
let favourites = new Set();

const audio = document.getElementById("audio");
const songTitle = document.getElementById("song-title");
const albumCover = document.getElementById("album-cover");
const songList = document.getElementById("song-list");
const sidebar = document.getElementById("sidebar");
const toggleBtn = document.getElementById("favourites-toggle");
const prevBtn = document.getElementById("prev-btn");
const nextBtn = document.getElementById("next-btn");

function loadSong(index) {
    const song = songs[index];
    songTitle.textContent = song.title;
    albumCover.src = song.cover;
    audio.src = song.src;
    audio.play();
}

function renderSongs(listType = "playlist") {
    songList.innerHTML = "";
    const list = listType === "favourites" ? Array.from(favourites) : songs;
    list.forEach((song, index) => {
        const li = document.createElement("li");
        li.innerHTML = `
            ${song.title}
            <span class="heart ${favourites.has(song) ? "active" : ""}">&hearts;</span>
        `;
        li.addEventListener("click", () => loadSong(index));
        li.querySelector(".heart").addEventListener("click", (e) => {
            e.stopPropagation();
            toggleFavourite(song);
            renderSongs(listType);
        });

        // li.getElementsByClassName("heart")[0].addEventListener("click", (e) => {
        //     e.stopPropagation();
        //     toggleFavourite(song);
        //     renderSongs(listType);
        // });
        
        songList.appendChild(li);
    });
}

function toggleFavourite(song) {
    if (favourites.has(song)) {
        favourites.delete(song);
    } else {
        favourites.add(song);
    }
}


toggleBtn.addEventListener("click", () => {
    const isFavourites = toggleBtn.textContent.includes("Favourites");
    toggleBtn.textContent = isFavourites ? "Show Playlist" : "Show Favourites";
    document.getElementById("sidebar-title").textContent = isFavourites ? "Favourites" : "Playlist";
    renderSongs(isFavourites ? "favourites" : "playlist");
});

prevBtn.addEventListener("click", () => {
    currentSongIndex = (currentSongIndex - 1 + songs.length) % songs.length;
    loadSong(currentSongIndex);
});

nextBtn.addEventListener("click", () => {
    currentSongIndex = (currentSongIndex + 1) % songs.length;
    loadSong(currentSongIndex);
});

// start
loadSong(currentSongIndex);
renderSongs();
sidebar.classList.add("open");
