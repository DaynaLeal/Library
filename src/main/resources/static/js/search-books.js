$(document).ready(function () {




});





fetch("https://www.googleapis.com/books/v1/volumes?q=ibsn:9780747591054")
    .then(function(res) {
        return res.json();
    })
    .then(function(result) {
        for (let i = 0; i < 10; i++){
            let title = result.items[i].volumeInfo.title;
            let description = result.items[i].volumeInfo.description;
            let image = result.items[i].volumeInfo.imageLinks.thumbnail;
            let cardDiv = document.getElementById("content");
            cardDiv.innerHTML +=
                `<div class="col-4">
                        <div class="card m-2">
                            <img class="card-img-top" src="` + image + `" alt="Card image cap">
                            <div class="card-body">
                                <h5 class="card-title">` + title + `</h5>
                                <p class="card-text">` + description + `</p>
                                <a href="#" class="btn text-white btn-info">Go somewhere</a>
                            </div>
                        </div>
                    </div>`;
        }

    }),
    function(error) {
        console.log(error);
    };
