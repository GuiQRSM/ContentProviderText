package com.littletoth.contentprovidertext.database

import android.content.ContentProvider
import android.content.ContentValues
import android.content.UriMatcher
import android.database.Cursor
import android.net.Uri

class NoteProvider : ContentProvider() {

    private lateinit var mUriMatcher: UriMatcher

    override fun onCreate(): Boolean {
      mUriMatcher = UriMatcher(UriMatcher.NO_MATCH)
      mUriMatcher.addURI(AUTHOTRITY, "notes", NOTES)
        mUriMatcher.addURI(AUTHOTRITY,"notes/#", NOTES_BY_ID)

        return true
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<String>?): Int {
        TODO("Implement this to handle requests to delete one or more rows")
    }

    override fun getType(uri: Uri): String? {
        TODO(
            "Implement this to handle requests for the MIME type of the data" +
                    "at the given URI"
        )
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        TODO("Implement this to handle requests to insert a new row.")
    }

    override fun query(
        uri: Uri, projection: Array<String>?, selection: String?,
        selectionArgs: Array<String>?, sortOrder: String?
    ): Cursor? {
        TODO("Implement this to handle query requests from clients.")
    }

    override fun update(
        uri: Uri, values: ContentValues?, selection: String?,
        selectionArgs: Array<String>?
    ): Int {
        TODO("Implement this to handle requests to update one or more rows.")
    }

    companion object {
        const val AUTHOTRITY = "com.littletoth.aplicationcontentprovider.provider"
        val BASE_URI = Uri.parse("content://$AUTHOTRITY")
        val URI_NOTES = Uri.withAppendedPath(BASE_URI, "notes")

        const val NOTES = 1
        const val NOTES_BY_ID = 2
    }



}