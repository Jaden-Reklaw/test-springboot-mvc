<html>
<head>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <%-- Import Bootstrap in the project --%>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body>
    <div class="col-lg-6">
        <form:form modelAttribute="contact" action="/contact" method="post" cssClass="form-horizontal">

            <fieldset>
                <legend>Contact Form</legend>
                <form:hidden path="contactId"/>
                    <%-- First Name --%>
                <div class="form-group">
                    <label class="col-lg-2 control-label">First Name:</label>
                    <div class="col-lg-6">
                        <form:input path="firstName" class="form-control"/>
                    </div>
                </div>
                    <%-- Last Name --%>
                <div class="form-group">
                    <label class="col-lg-2 control-label">Last Name:</label>
                    <div class="col-lg-6">
                        <form:input path="lastName" class="form-control"/>
                    </div>
                </div>
                    <%-- Address --%>
                <div class="form-group">
                    <label class="col-lg-2 control-label">Address;</label>
                    <div class="col-lg-6">
                        <form:input path="address" class="form-control"/>
                    </div>
                </div>
                    <%-- City --%>
                <div class="form-group">
                    <label class="col-lg-2 control-label">City:</label>
                    <div class="col-lg-6">
                        <form:input path="city" class="form-control"/>
                    </div>
                </div>
                    <%-- State --%>
                <div class="form-group">
                    <label class="col-lg-2 control-label">State:</label>
                    <div class="col-lg-6">
                        <form:input path="state" class="form-control"/>
                    </div>
                </div>
                    <%-- Zip --%>
                <div class="form-group">
                    <label class="col-lg-2 control-label">Zip Code:</label>
                    <div class="col-lg-6">
                        <form:input path="zipCode" class="form-control"/>
                    </div>
                </div>

                <div class="form-group">
                    <form:button class="btn btn-primary">Add Contact</form:button>
                </div>
            </fieldset>
        </form:form>
    </div>
</body>
</html>