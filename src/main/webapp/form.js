function f() {

    document.getElementById('idd').innerHTML =
        "Choose template:<br/>" +
        "<input type='radio' id = 't1' name='templateName' onchange='chooseType()' value = 'Cutaway'/><label>Cutaway</label><br/>"+
        "<input type='radio' id = 't2' name='templateName' onchange='chooseType()' value = 'Calendar'/><label>Calendar</label><br/>"+
        "<input type='radio' id = 't3' name='templateName' onchange='chooseType()' value = 'Postcard'/><label>Postcard</label><br/>"+
        "<input type='radio' id = 't4' name='templateName' onchange='chooseType()' value = 'Bookmark'/><label>Bookmark</label><br/>";

}

function chooseType() {

    if(document.getElementsByName('templateName')[0].checked == true) {

        document.getElementById('idd').innerHTML =
            "<p>Choose template:<br/>" +
            "<input type='radio' id = 't1' name='templateName'  checked = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>"+
            "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>"+
            "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>"+
            "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>"+
            "<p>Choose type of template:<br/>" +
            "<input type='radio' name='templateType' onchange='chooseFormat(1)' value = 'IT'/><label>IT</label><br/>"+
            "<input type='radio' name='templateType' onchange='chooseFormat(2)' value = 'Cars'/><label>Cars</label><br/>"+
            "<input type='radio' name='templateType' onchange='chooseFormat(3)' value = 'Postcard'/><label>Postcard</label><br/>"+
            "<input type='radio' name='templateType' onchange='chooseFormat(4)' value = 'Party'/><label>Party</label><br/>"+
            "<input type='radio' name='templateType' onchange='chooseFormat(5)' value = 'Electronics'/><label>Electronics</label><br/>";

    } else if (document.getElementsByName('templateName')[1].checked == true){

        document.getElementById('idd').innerHTML =
            "<p>Choose template:<br/>" +
            "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>"+
            "<input type='radio' id = 't2' name='templateName'  checked = 'true' value = 'Calendar'/><label>Calendar</label><br/>"+
            "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>"+
            "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>"+
            "<p>Choose type of template:<br/>" +
            "<input type='radio' name='templateType' onchange='chooseFormat(1)' value = 'IT'/><label>IT</label><br/>"+
            "<input type='radio' name='templateType' onchange='chooseFormat(2)' value = 'Cars'/><label>Cars</label><br/>"+
            "<input type='radio' name='templateType' onchange='chooseFormat(3)' value = 'Girls'/><label>Girls</label><br/>"+
            "<input type='radio' name='templateType' onchange='chooseFormat(4)' value = 'Future'/><label>Future</label><br/>"+
            "<input type='radio' name='templateType' onchange='chooseFormat(5)' value = 'Personal'/><label>Personal</label><br/>";

    } else if (document.getElementsByName('templateName')[2].checked == true){

        document.getElementById('idd').innerHTML =
            "<p>Choose template:<br/>" +
            "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>"+
            "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>"+
            "<input type='radio' id = 't3' name='templateName'  checked = 'true' value = 'Postcard'/><label>Postcard</label><br/>"+
            "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>"+
            "<p>Choose type of template:<br/>" +
            "<input type='radio' name='templateType' onchange='chooseFormat(1)' value = 'Party'/><label>Party</label><br/>"+
            "<input type='radio' name='templateType' onchange='chooseFormat(2)' value = 'Cars'/><label>Cars</label><br/>"+
            "<input type='radio' name='templateType' onchange='chooseFormat(3)' value = 'Holidays'/><label>Holidays</label><br/>"+
            "<input type='radio' name='templateType' onchange='chooseFormat(4)' value = 'Party'/><label>Future</label><br/>"+
            "<input type='radio' name='templateType' onchange='chooseFormat(5)' value = 'Musical'/><label>Musical</label><br/>";

    } else if (document.getElementsByName('templateName')[3].checked == true){

        document.getElementById('idd').innerHTML =
            "<p>Choose template:<br/>" +
            "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>"+
            "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>"+
            "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>"+
            "<input type='radio' id = 't4' name='templateName'  checked = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>"+
            "<p>Choose type of template:<br/>" +
            "<input type='radio' name='templateType' onchange='chooseFormat(1)' value = 'Science'/><label>Science</label><br/>"+
            "<input type='radio' name='templateType' onchange='chooseFormat(2)' value = 'Cars'/><label>Cars</label><br/>"+
            "<input type='radio' name='templateType' onchange='chooseFormat(3)' value = 'Party'/><label>Future</label><br/>";
    }

}

function chooseFormat(a) {

    if(document.getElementsByName('templateName')[0].checked == true) {

        if(a == 1) {

            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  checked = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' checked = 'true'  value = 'IT'/><label>IT</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Party'/><label>Party</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Electronics'/><label>Electronics</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat' checked = 'true' value = '90x50'/><label>90х50</label><br/>" +
                "<input type='radio' name='templateFormat' value = '85x55'/><label>85х55</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";


        } else if (a == 2) {

            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  checked = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'IT'/><label>IT</label><br/>" +
                "<input type='radio' name='templateType' checked = 'true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Party'/><label>Party</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Electronics'/><label>Electronics</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = '90x50'/><label>90х50</label><br/>" +
                "<input type='radio' name='templateFormat' value = '85x55'/><label>85х55</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";

        } else if (a == 3) {

            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  checked = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'IT'/><label>IT</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' checked = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Party'/><label>Party</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Electronics'/><label>Electronics</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = '90x50'/><label>90х50</label><br/>" +
                "<input type='radio' name='templateFormat' value = '85x55'/><label>85х55</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";
        } else if (a == 4) {

            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  checked = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'IT'/><label>IT</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' name='templateType' checked = 'true' value = 'Party'/><label>Party</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Electronics'/><label>Electronics</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = '90x50'/><label>90x50</label><br/>" +
                "<input type='radio' name='templateFormat' value = '85x55'/><label>85х55</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";
        } else if (a == 5) {

            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  checked = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'IT'/><label>IT</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Party'/><label>Party</label><br/>" +
                "<input type='radio' name='templateType' checked = 'true' value = 'Electronics'/><label>Electronics</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = '90x50'/><label>90х50</label><br/>" +
                "<input type='radio' name='templateFormat' value = '85x55'/><label>85х55</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";
        }

    } else if (document.getElementsByName('templateName')[1].checked == true) {

        if (a == 1) {
            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  checked = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' checked = 'true' value = 'IT'/><label>IT</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Girls'/><label>Girls</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Future'/><label>Future</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Personal'/><label>Personal</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = 'A1'/><label>А1</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A2'/><label>А2</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A3'/><label>А3</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A4'/><label>А4</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A5'/><label>А5</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";

        } else if (a == 2) {
            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  checked = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'IT'/><label>IT</label><br/>" +
                "<input type='radio' name='templateType' checked = 'true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Girls'/><label>Girls</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Future'/><label>Future</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Personal'/><label>Personal</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = 'A1'/><label>А1</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A2'/><label>А2</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A3'/><label>А3</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A4'/><label>А4</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A5'/><label>А5</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";
        } else if (a == 3) {
            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  checked = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'IT'/><label>IT</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' checked = 'true' value = 'Girls'/><label>Girls</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Future'/><label>Future</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Personal'/><label>Personal</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = 'A1'/><label>А1</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A2'/><label>А2</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A3'/><label>А3</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A4'/><label>А4</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A5'/><label>А5</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";
        } else if (a == 4) {
            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  checked = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'IT'/><label>IT</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Girls'/><label>Girls</label><br/>" +
                "<input type='radio' name='templateType' checked = 'true' value = 'Future'/><label>Future</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Personal'/><label>Personal</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = 'A1'/><label>А1</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A2'/><label>А2</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A3'/><label>А3</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A4'/><label>А4</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A5'/><label>А5</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";
        } else if (a == 5) {
            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  checked = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'IT'/><label>IT</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Girls'/><label>Girls</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Future'/><label>Future</label><br/>" +
                "<input type='radio' name='templateType' checked = 'true' value = 'Personal'/><label>Personal</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = 'A1'/><label>А1</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A2'/><label>А2</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A3'/><label>А3</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A4'/><label>А4</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A5'/><label>А5</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";
        }

    } else if (document.getElementsByName('templateName')[2].checked == true) {

        if (a == 1) {

            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  checked = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' checked ='true' value = 'Party'/><label>Party</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Holidays'/><label>Holidays</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Party'/><label>Future</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Musical'/><label>Musical</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = 'A4'/><label>А4</label><br/>" +
                "<input type='radio' name='templateFormat' value = '200x200'/><label>200x200</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A5'/><label>А5</label><br/>" +
                "<input type='radio' name='templateFormat' value = '96x210'/><label>96x210</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A6'/><label>А6</label><br/>" +
                "<input type='radio' name='templateFormat' value = '105x146'/><label>105x146</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";

        } else if (a == 2) {

            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  checked = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' disabled ='true' value = 'Party'/><label>Party</label><br/>" +
                "<input type='radio' name='templateType' checked = 'true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Holidays'/><label>Holidays</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Party'/><label>Future</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Musical'/><label>Musical</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = 'A4'/><label>А4</label><br/>" +
                "<input type='radio' name='templateFormat' value = '200x200'/><label>200x200</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A5'/><label>А5</label><br/>" +
                "<input type='radio' name='templateFormat' value = '96x210'/><label>96x210</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A6'/><label>А6</label><br/>" +
                "<input type='radio' name='templateFormat' value = '105x146'/><label>105x146</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";

        } else if (a == 3) {

            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  checked = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' disabled ='true' value = 'Party'/><label>Party</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' checked = 'true' value = 'Holidays'/><label>Holidays</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Party'/><label>Future</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Musical'/><label>Musical</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = 'A4'/><label>А4</label><br/>" +
                "<input type='radio' name='templateFormat' value = '200x200'/><label>200x200</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A5'/><label>А5</label><br/>" +
                "<input type='radio' name='templateFormat' value = '96x210'/><label>96x210</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A6'/><label>А6</label><br/>" +
                "<input type='radio' name='templateFormat' value = '105x146'/><label>105x146</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";

        } else if (a == 4) {

            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  checked = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' disabled ='true' value = 'Party'/><label>Party</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Holidays'/><label>Holidays</label><br/>" +
                "<input type='radio' name='templateType' checked = 'true' value = 'Party'/><label>Future</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Musical'/><label>Musical</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = 'A4'/><label>А4</label><br/>" +
                "<input type='radio' name='templateFormat' value = '200x200'/><label>200x200</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A5'/><label>А5</label><br/>" +
                "<input type='radio' name='templateFormat' value = '96x210'/><label>96x210</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A6'/><label>А6</label><br/>" +
                "<input type='radio' name='templateFormat' value = '105x146'/><label>105x146</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";

        } else if (a == 5) {

            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  checked = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  disabled = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' disabled ='true' value = 'Party'/><label>Party</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Holidays'/><label>Holidays</label><br/>" +
                "<input type='radio' name='templateType' disabled = 'true' value = 'Party'/><label>Future</label><br/>" +
                "<input type='radio' name='templateType' checked = 'true' value = 'Musical'/><label>Musical</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = 'A4'/><label>А4</label><br/>" +
                "<input type='radio' name='templateFormat' value = '200x200'/><label>200x200</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A5'/><label>А5</label><br/>" +
                "<input type='radio' name='templateFormat' value = '96x210'/><label>96x210</label><br/>" +
                "<input type='radio' name='templateFormat' value = 'A6'/><label>А6</label><br/>" +
                "<input type='radio' name='templateFormat' value = '105x146'/><label>105x146</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName' checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";

        }

    } else if (document.getElementsByName('templateName')[3].checked == true) {

        if (a == 1) {

            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  checked = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' checked ='true' value = 'Science'/><label>Science</label><br/>" +
                "<input type='radio' name='templateType' disabled ='true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' disabled ='true' value = 'Party'/><label>Future</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = '25x40'/><label>25x40</label><br/>" +
                "<input type='radio' name='templateFormat' value = '12x44'/><label>12x44</label><br/>" +
                "<input type='radio' name='templateFormat' value = '66x33'/><label>66x33</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";

        } else if (a == 2) {

            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  checked = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' disabled ='true' value = 'Science'/><label>Science</label><br/>" +
                "<input type='radio' name='templateType' checked ='true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' disabled ='true' value = 'Party'/><label>Future</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = '25x40'/><label>25x40</label><br/>" +
                "<input type='radio' name='templateFormat' value = '12x44'/><label>12x44</label><br/>" +
                "<input type='radio' name='templateFormat' value = '66x33'/><label>66x33</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true' value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";

        } else if (a == 3) {

            document.getElementById('idd').innerHTML =
                "<p>Choose template:<br/>" +
                "<input type='radio' id = 't1' name='templateName'  disabled = 'true' value = 'Cutaway'/><label>Cutaway</label><br/>" +
                "<input type='radio' id = 't2' name='templateName'  disabled = 'true' value = 'Calendar'/><label>Calendar</label><br/>" +
                "<input type='radio' id = 't3' name='templateName'  disabled = 'true' value = 'Postcard'/><label>Postcard</label><br/>" +
                "<input type='radio' id = 't4' name='templateName'  checked = 'true' value = 'Bookmark'/><label>Bookmark</label><br/>" +
                "<p>Choose type of template:<br/>" +
                "<input type='radio' name='templateType' disabled ='true' value = 'Science'/><label>Science</label><br/>" +
                "<input type='radio' name='templateType' disabled ='true' value = 'Cars'/><label>Cars</label><br/>" +
                "<input type='radio' name='templateType' checked ='true' value = 'Party'/><label>Future</label><br/>" +
                "<p>Choose format of template:<br/>" +
                "<input type='radio' name='templateFormat'checked = 'true' value = '25x40'/><label>25x40</label><br/>" +
                "<input type='radio' name='templateFormat' value = '12x44'/><label>12x44</label><br/>" +
                "<input type='radio' name='templateFormat' value = '66x33'/><label>66x33</label><br/>"+
                "<p>Choose material:<br/>" +
                "<input type='radio' name='productName'checked = 'true' value='Paperboard' /><label>Paperboard</label><br/>"+
                "<input type='radio' name='productName' value='Paper' /><label>Paper</label><br/>"+
                "<input type='radio' name='productName' value='Plastic' /><label>Plastic</label><br/>"+
                "<input type='radio' name='productName' value='Skin' /><label>Skin</label><br/>"+
                "<input type='radio' name='productName' value='Glass' /><label>Glass</label><br/>"+
                "<p>Choose product type:<br/>" +
                "<input type='radio' name='productType'checked = 'true'  value='Сurve' /><label>Сurve</label><br/>"+
                "<input type='radio' name='productType' value='Mat' /><label>Mat</label><br/>"+
                "<input type='radio' name='productType' value='Gloss' /><label>Gloss</label><br/>"+
                "<input type='radio' name='productType' value='Natural' /><label>Natural</label><br/>";

        }
    }

}

function reset() {

    document.getElementById('idd').innerText = "";
}