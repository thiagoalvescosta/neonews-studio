<div class="component-holder ng-binding ng-scopes" data-component="crn-datasource" id="crn-datasource-763276"> 
   <datasource on-load="${model.dataSourceName}.startEditing()" <#if model.hasColumnFilter()>filter="/{{params.id}}"</#if> name="${model.dataSourceName}" entity="${model.dataSourceFullName}" keys="${model.dataSourcePrimaryKeys}" rows-per-page="100" delete-message="Deseja remover?" class=""></datasource> 
</div> 

<div class="x_title">
  <h2>{{${model.dataSourceName}.active.name}}</h2>
  <ul class="nav navbar-right panel_toolbox">
    <li><a class="dropdown-toggle" ng-click="${model.dataSourceName}.post()"><i class="fa fa-floppy-o"></i> SALVAR</a>
    </li>
  </ul>
  <div class="clearfix"></div>
</div>

<div class="component-holder ng-binding ng-scope " data-component="crn-form" id="crn-form-form-${model.dataSourceName}"> 
  <div class="form"> 
    <form crn-datasource="${model.dataSourceName}" class=""> 
      <fieldset ng-disabled="!datasource.editing &amp;&amp; !datasource.inserting"> 
        <div class=""></div> 
        <#list model.formFields as field>
        <div class="component-holder ng-binding ng-scope " data-component="crn-textinput" id="crn-textinput-${field.name}"> 
          <div class="form-group"> 
            <label for="textinput-${field.name}" class="">${model.formMapLabels[field.name]!}</label> 

  <#if field.isBoolean() >
        <input type="checkbox" ng-model="${model.dataSourceName}.active.${field.name}"  id="textinput-${field.name}" placeholder="<#if field.label?has_content>${field.label}<#else>${field.name}</#if>" <#if !field.isNullable()>required="required"</#if>> 
  <#elseif (field.isDate() || field.isTime() || field.isTimestamp()) >
        <div style="position:relative">
          <input type="text" as-date 
            <#if field.isDate() >
            format="DD/MM/YYYY"
            <#elseif field.isTime()>
            format="HH:mm:ss"
            <#elseif field.isTimestamp()>
            format="DD/MM/YYYY HH:mm:ss"
            </#if>
          ng-model="${model.dataSourceName}.active.${field.name}" class="form-control" id="textinput-${field.name}" placeholder="<#if field.label?has_content>${field.label}<#else>${field.name}</#if>" <#if !field.isNullable()>required="required"</#if>>
        </div>
  <#elseif field.isNumber() >
        <input type="number" ng-model="${model.dataSourceName}.active.${field.name}" class="form-control" id="textinput-${field.name}" placeholder="<#if field.label?has_content>${field.label}<#else>${field.name}</#if>" <#if !field.isNullable()>required="required"</#if>> 
  <#elseif field.getProperty("ngOptions")?? >

    <datasource name="${field.getProperty("ngOptions").dataSourceName}" entity="${field.getProperty("ngOptions").dataSourceUrl}" keys="${field.getProperty("ngOptions").keys}" class=""></datasource> 

    <select ng-model="${model.dataSourceName}.active.${field.name}" class="form-control" id="textinput-${field.name}" ng-options="${field.getProperty("ngOptions").options}" <#if !field.isNullable()>required="required"</#if>>
      <option value=''>None</option>
    </select>

  <#else>
        <input type="text" ng-model="${model.dataSourceName}.active.${field.name}" class="form-control" id="textinput-${field.name}" placeholder="<#if field.label?has_content>${field.label}<#else>${field.name}</#if>" <#if model.formMapMasks[field.name]?has_content>mask="${model.formMapMasks[field.name]}"</#if> <#if !field.isNullable()>required="required"</#if>> 
  </#if>

          </div> 
        </div> 
        <div class=""></div> 
    </#list>
      </fieldset> 
    </form> 
  </div> 
</div> 