val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2}\s$month\s\d{4}"""

//regex pattern bisa diganti pake variable, kalau mau akses langsung pakai $, spt $var1