package weathernotificationservice.wns.activities;

import android.net.Uri;

/**
 *
 */
public class Contact {

    private String _name, _email;
    private Uri _imageURI;
    private int _id;

    public Contact(int id, String name, String email, Uri imageURI) {
        _id = id;
        _name = name;
        _email = email;
        _imageURI = imageURI;
    }

    public int getId() { return _id; }

    public String getName() {
        return _name;
    }


    public String getEmail() {
        return _email;
    }


    public Uri getImageURI() { return _imageURI; }
}
