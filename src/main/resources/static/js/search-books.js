$(document).ready(function () {

    $(this).find("#search-btn").click(function () {
        let fetchInput = 'https://www.googleapis.com/books/v1/volumes?q=';
        let titleInput = $('#search-title').val();
        let authorInput = $('#search-author').val();
        let isbnInput = $('#search-isbn').val();
        if (isbnInput !== ''){
            fetchInput += 'isbn=' + isbnInput.replace(/ /g,'');
        } else {
            if (titleInput !== ''){
                fetchInput += 'title=' + titleInput.replace(/ /g,'');
            }
            if(authorInput !== ''){
                fetchInput += 'author=' + authorInput.replace(/ /g,'');
            }
        }
        console.log(fetchInput);
        fetchRequest(fetchInput)


    });


    function fetchRequest(fetchInput){


        fetch(fetchInput)
            .then(function(res) {
                return res.json();
            })
            .then(function(result) {
                for (let i = 0; i < 10; i++){
                    let title = result.items[0].volumeInfo.title;
                    let description = result.items[0].volumeInfo.description;
                    let image = result.items[i].volumeInfo.imageLinks.thumbnail;
                    let googleId = result.items[i].id;
                    // $(".book-title").html(title);
                    // $(".book-description").html(description);
                    // document.getElementsByClassName("book-title").innerHTML = title;
                    // document.getElementsByClassName("book-description").innerHTML = description;
                    let cardDiv = document.getElementById("content");
                    cardDiv.innerHTML +=
                        `<div class="col-4">
                        <div class="card m-2">
                            <img class="card-img-top" src="` + image + `" alt="Card image cap">
                            <div class="card-body">
                                <h5 class="card-title">` + title + `</h5>
                                <p class="card-text">` + description + `</p>
                                <input class="btn btn-info search-choice" type="submit" value="` + googleId +`">
                            </div>
                        </div>
                    </div>`;
                }

            }),
            function(error) {
                console.log(error);
            };
    }

    // $(".card").click(function () {
    //     // let choiceValue = $(this).find(".search-choice").val();
    //     // console.log(choiceValue)
    //     console.log('clicked')
    // })

});






