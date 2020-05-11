////调试表原始对象
//{
//  "title" : "调试：com.intellij.database.psi.DbTableImpl",
//  "methodList" : [ {
//    "name" : "getColumnAttrs",
//    "desc" : "public java.util.Set<com.intellij.database.model.DasColumn$Attribute> com.intellij.database.psi.DbTableImpl.getColumnAttrs(com.intellij.database.model.DasColumn)",
//    "value" : null
//  }, {
//    "name" : "getDocumentation",
//    "desc" : "public java.lang.StringBuilder com.intellij.database.psi.DbTableImpl.getDocumentation()",
//    "value" : "<html><body><b>Data Source:</b> database@localhost<br><b>Schema:</b> foodie-shop<br><b>Table:</b> carousel<br><br><font color=\"#808080\">-- 轮播图 </font><br><code><pre><font color=\"#808080\">-- auto-generated definition</font>\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">table</font> carousel\n(\n    id               <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">64</font>)  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;主键&#39;</font>\n        <font color=\"#cc7832\">primary</font> <font color=\"#cc7832\">key</font><font color=\"#cc7832\">,</font>\n    image_url        <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">128</font>) <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;图片 图片地址&#39;</font><font color=\"#cc7832\">,</font>\n    background_color <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">32</font>)  <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;背景色&#39;</font><font color=\"#cc7832\">,</font>\n    item_id          <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">64</font>)  <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;商品id 商品id&#39;</font><font color=\"#cc7832\">,</font>\n    cat_id           <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">64</font>)  <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;商品分类id 商品分类id&#39;</font><font color=\"#cc7832\">,</font>\n    type             <font color=\"#cc7832\">int</font>          <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类&#39;</font><font color=\"#cc7832\">,</font>\n    sort             <font color=\"#cc7832\">int</font>          <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;轮播图展示顺序&#39;</font><font color=\"#cc7832\">,</font>\n    is_show          <font color=\"#cc7832\">int</font>          <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;是否展示&#39;</font><font color=\"#cc7832\">,</font>\n    create_time      <font color=\"#cc7832\">datetime</font>     <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;创建时间 创建时间&#39;</font><font color=\"#cc7832\">,</font>\n    update_time      <font color=\"#cc7832\">datetime</font>     <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;更新时间 更新&#39;</font>\n)\n    <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;轮播图 &#39;</font><font color=\"#cc7832\">;</font></pre></code>"
//  }, {
//    "name" : "getDocumentation",
//    "desc" : "public java.lang.CharSequence com.intellij.database.psi.DbTableImpl.getDocumentation()",
//    "value" : "<html><body><b>Data Source:</b> database@localhost<br><b>Schema:</b> foodie-shop<br><b>Table:</b> carousel<br><br><font color=\"#808080\">-- 轮播图 </font><br><code><pre><font color=\"#808080\">-- auto-generated definition</font>\n<font color=\"#cc7832\">create</font> <font color=\"#cc7832\">table</font> carousel\n(\n    id               <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">64</font>)  <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;主键&#39;</font>\n        <font color=\"#cc7832\">primary</font> <font color=\"#cc7832\">key</font><font color=\"#cc7832\">,</font>\n    image_url        <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">128</font>) <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;图片 图片地址&#39;</font><font color=\"#cc7832\">,</font>\n    background_color <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">32</font>)  <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;背景色&#39;</font><font color=\"#cc7832\">,</font>\n    item_id          <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">64</font>)  <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;商品id 商品id&#39;</font><font color=\"#cc7832\">,</font>\n    cat_id           <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">64</font>)  <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;商品分类id 商品分类id&#39;</font><font color=\"#cc7832\">,</font>\n    type             <font color=\"#cc7832\">int</font>          <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类&#39;</font><font color=\"#cc7832\">,</font>\n    sort             <font color=\"#cc7832\">int</font>          <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;轮播图展示顺序&#39;</font><font color=\"#cc7832\">,</font>\n    is_show          <font color=\"#cc7832\">int</font>          <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;是否展示&#39;</font><font color=\"#cc7832\">,</font>\n    create_time      <font color=\"#cc7832\">datetime</font>     <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;创建时间 创建时间&#39;</font><font color=\"#cc7832\">,</font>\n    update_time      <font color=\"#cc7832\">datetime</font>     <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;更新时间 更新&#39;</font>\n)\n    <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;轮播图 &#39;</font><font color=\"#cc7832\">;</font></pre></code>"
//  }, {
//    "name" : "isTemporary",
//    "desc" : "public boolean com.intellij.database.psi.DbTableImpl.isTemporary()",
//    "value" : "false"
//  }, {
//    "name" : "isSystem",
//    "desc" : "public boolean com.intellij.database.psi.DbTableImpl.isSystem()",
//    "value" : "false"
//  }, {
//    "name" : "getName",
//    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
//    "value" : "carousel"
//  }, {
//    "name" : "getName",
//    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
//    "value" : null
//  }, {
//    "name" : "getTypeName",
//    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
//    "value" : "table"
//  }, {
//    "name" : "getParent",
//    "desc" : "public com.intellij.database.psi.DbElement com.intellij.database.psi.DbElementImpl.getParent()",
//    "value" : "schema:foodie-shop"
//  }, {
//    "name" : "getParent",
//    "desc" : "public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbElementImpl.getParent()",
//    "value" : "schema:foodie-shop"
//  }, {
//    "name" : "getParent",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getParent()",
//    "value" : "schema:foodie-shop"
//  }, {
//    "name" : "init",
//    "desc" : "public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
//    "value" : null
//  }, {
//    "name" : "setName",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "getLanguage",
//    "desc" : "public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
//    "value" : "Language: SQL"
//  }, {
//    "name" : "getKind",
//    "desc" : "public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
//    "value" : "table"
//  }, {
//    "name" : "getProject",
//    "desc" : "public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
//    "value" : "Project '/Users/adamchang/cgh/code/test/demo/springbooteasycode' springbooteasycode"
//  }, {
//    "name" : "getText",
//    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
//    "value" : "create table carousel\n(\n    id               varchar(64)  not null comment '主键'\n        primary key,\n    image_url        varchar(128) not null comment '图片 图片地址',\n    background_color varchar(32)  null comment '背景色',\n    item_id          varchar(64)  null comment '商品id 商品id',\n    cat_id           varchar(64)  null comment '商品分类id 商品分类id',\n    type             int          not null comment '轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类',\n    sort             int          not null comment '轮播图展示顺序',\n    is_show          int          not null comment '是否展示',\n    create_time      datetime     not null comment '创建时间 创建时间',\n    update_time      datetime     not null comment '更新时间 更新'\n)\n    comment '轮播图 ';\n\n"
//  }, {
//    "name" : "navigate",
//    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],boolean,com.intellij.database.util.DbImplUtil$TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
//    "value" : null
//  }, {
//    "name" : "navigate",
//    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
//    "value" : null
//  }, {
//    "name" : "navigate",
//    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],com.intellij.database.util.DbImplUtil$TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
//    "value" : null
//  }, {
//    "name" : "isCaseSensitive",
//    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
//    "value" : "false"
//  }, {
//    "name" : "getVirtualFile",
//    "desc" : "public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
//    "value" : "DB VirtualFile: table, foodie-shop.carousel [database@localhost] (Valid)"
//  }, {
//    "name" : "processChildren",
//    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<com.intellij.psi.PsiFileSystemItem>)",
//    "value" : null
//  }, {
//    "name" : "getMetaData",
//    "desc" : "public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
//    "value" : "table:carousel"
//  }, {
//    "name" : "getDelegate",
//    "desc" : "public D com.intellij.database.psi.DbElementImpl.getDelegate()",
//    "value" : "carousel: table"
//  }, {
//    "name" : "getDasChildren",
//    "desc" : "public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
//    "value" : null
//  }, {
//    "name" : "getDasParent",
//    "desc" : "public P com.intellij.database.psi.DbElementImpl.getDasParent()",
//    "value" : "schema:foodie-shop"
//  }, {
//    "name" : "getDasParent",
//    "desc" : "public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
//    "value" : "schema:foodie-shop"
//  }, {
//    "name" : "getLocationString",
//    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
//    "value" : "foodie-shop [database@localhost]"
//  }, {
//    "name" : "checkSetName",
//    "desc" : "public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "canNavigate",
//    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
//    "value" : null
//  }, {
//    "name" : "canNavigateToSource",
//    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
//    "value" : null
//  }, {
//    "name" : "acceptChildren",
//    "desc" : "public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
//    "value" : null
//  }, {
//    "name" : "processDeclarations",
//    "desc" : "public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
//    "value" : null
//  }, {
//    "name" : "getDataSource",
//    "desc" : "public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
//    "value" : "root:database@localhost"
//  }, {
//    "name" : "getDataSource",
//    "desc" : "public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
//    "value" : "root:database@localhost"
//  }, {
//    "name" : "getBaseIcon",
//    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
//    "value" : "jar:file:/Applications/IntelliJ%20IDEA3.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg"
//  }, {
//    "name" : "createDeclarationProcessor",
//    "desc" : "public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
//    "value" : null
//  }, {
//    "name" : "newDeclarationProcessor",
//    "desc" : "public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement)",
//    "value" : null
//  }, {
//    "name" : "getIcon",
//    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
//    "value" : null
//  }, {
//    "name" : "getIcon",
//    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
//    "value" : "Deferred. Base=Row icon. myIcons=[jar:file:/Applications/IntelliJ%20IDEA3.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg, null]"
//  }, {
//    "name" : "getManager",
//    "desc" : "public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
//    "value" : "com.intellij.psi.impl.PsiManagerImpl@2adece73"
//  }, {
//    "name" : "getDeclaration",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
//    "value" : "table:carousel"
//  }, {
//    "name" : "getWeight",
//    "desc" : "public int com.intellij.database.psi.DbElementImpl.getWeight()",
//    "value" : "10000"
//  }, {
//    "name" : "isValid",
//    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isValid()",
//    "value" : "true"
//  }, {
//    "name" : "getPosition",
//    "desc" : "public short com.intellij.database.psi.DbElementImpl.getPosition()",
//    "value" : "0"
//  }, {
//    "name" : "getComment",
//    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
//    "value" : "轮播图 "
//  }, {
//    "name" : "getChildren",
//    "desc" : "public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
//    "value" : "[Lcom.intellij.psi.PsiElement;@46f60f6e"
//  }, {
//    "name" : "isWritable",
//    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
//    "value" : "true"
//  }, {
//    "name" : "isDirectory",
//    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
//    "value" : "false"
//  }, {
//    "name" : "getNode",
//    "desc" : "public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
//    "value" : null
//  }, {
//    "name" : "isPhysical",
//    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
//    "value" : "false"
//  }, {
//    "name" : "getPrevSibling",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
//    "value" : null
//  }, {
//    "name" : "findElementAt",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
//    "value" : null
//  }, {
//    "name" : "getFirstChild",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
//    "value" : null
//  }, {
//    "name" : "getNextSibling",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
//    "value" : null
//  }, {
//    "name" : "getPresentation",
//    "desc" : "public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
//    "value" : "table:carousel"
//  }, {
//    "name" : "getPresentableText",
//    "desc" : "public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
//    "value" : "carousel"
//  }, {
//    "name" : "getTextRange",
//    "desc" : "public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
//    "value" : null
//  }, {
//    "name" : "getStartOffsetInParent",
//    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
//    "value" : "0"
//  }, {
//    "name" : "getTextOffset",
//    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
//    "value" : "0"
//  }, {
//    "name" : "textToCharArray",
//    "desc" : "public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
//    "value" : null
//  }, {
//    "name" : "textContains",
//    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
//    "value" : null
//  }, {
//    "name" : "getIcon",
//    "desc" : "public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
//    "value" : null
//  }, {
//    "name" : "getLastChild",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
//    "value" : null
//  }, {
//    "name" : "getTextLength",
//    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
//    "value" : "0"
//  }, {
//    "name" : "add",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "replace",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "checkDelete",
//    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "delete",
//    "desc" : "public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "accept",
//    "desc" : "public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
//    "value" : null
//  }, {
//    "name" : "getContext",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
//    "value" : "schema:foodie-shop"
//  }, {
//    "name" : "copy",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
//    "value" : null
//  }, {
//    "name" : "addBefore",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "addAfter",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "checkAdd",
//    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "getReferences",
//    "desc" : "public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
//    "value" : "[Lcom.intellij.psi.PsiReference;@12def38f"
//  }, {
//    "name" : "getContainingFile",
//    "desc" : "public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
//    "value" : null
//  }, {
//    "name" : "findReferenceAt",
//    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
//    "value" : null
//  }, {
//    "name" : "getNavigationElement",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
//    "value" : "table:carousel"
//  }, {
//    "name" : "getOriginalElement",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
//    "value" : "table:carousel"
//  }, {
//    "name" : "textMatches",
//    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
//    "value" : null
//  }, {
//    "name" : "textMatches",
//    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
//    "value" : null
//  }, {
//    "name" : "addRangeBefore",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "addRangeAfter",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "deleteChildRange",
//    "desc" : "public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "getReference",
//    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
//    "value" : null
//  }, {
//    "name" : "getResolveScope",
//    "desc" : "public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
//    "value" : "Project and Libraries"
//  }, {
//    "name" : "getUseScope",
//    "desc" : "public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
//    "value" : "Project and Libraries"
//  }, {
//    "name" : "isEquivalentTo",
//    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
//    "value" : null
//  }, {
//    "name" : "addRange",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "createLayeredIcon",
//    "desc" : "public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.createLayeredIcon(com.intellij.openapi.util.Iconable,javax.swing.Icon,int)",
//    "value" : null
//  }, {
//    "name" : "registerIconLayer",
//    "desc" : "public static void com.intellij.psi.impl.ElementBase.registerIconLayer(int,javax.swing.Icon)",
//    "value" : null
//  }, {
//    "name" : "transformFlags",
//    "desc" : "public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
//    "value" : null
//  }, {
//    "name" : "isNativeFileType",
//    "desc" : "public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
//    "value" : null
//  }, {
//    "name" : "overlayIcons",
//    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.overlayIcons(javax.swing.Icon...)",
//    "value" : null
//  }, {
//    "name" : "buildRowIcon",
//    "desc" : "public static com.intellij.ui.icons.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
//    "value" : null
//  }, {
//    "name" : "iconWithVisibilityIfNeeded",
//    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
//    "value" : null
//  }, {
//    "name" : "replace",
//    "desc" : "public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
//    "value" : null
//  }, {
//    "name" : "getUserData",
//    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
//    "value" : null
//  }, {
//    "name" : "putUserData",
//    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
//    "value" : null
//  }, {
//    "name" : "getUserDataString",
//    "desc" : "public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
//    "value" : "{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@31d03ae2, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@6da1c7fd, lastComputedIcon={0=Row icon. myIcons=[jar:file:/Applications/IntelliJ%20IDEA3.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg, null]}}"
//  }, {
//    "name" : "copyUserDataTo",
//    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
//    "value" : null
//  }, {
//    "name" : "getCopyableUserData",
//    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
//    "value" : null
//  }, {
//    "name" : "putCopyableUserData",
//    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
//    "value" : null
//  }, {
//    "name" : "putUserDataIfAbsent",
//    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
//    "value" : null
//  }, {
//    "name" : "copyCopyableDataTo",
//    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
//    "value" : null
//  }, {
//    "name" : "isUserDataEmpty",
//    "desc" : "public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
//    "value" : "false"
//  }, {
//    "name" : "getTextRangeInParent",
//    "desc" : "public default com.intellij.openapi.util.TextRange com.intellij.psi.PsiElement.getTextRangeInParent()",
//    "value" : "(0,0)"
//  }, {
//    "name" : "getDbParent",
//    "desc" : "public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
//    "value" : "schema:foodie-shop"
//  }, {
//    "name" : "getDbChildren",
//    "desc" : "public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
//    "value" : null
//  }, {
//    "name" : "getDependencies",
//    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependencies()",
//    "value" : "[Ljava.lang.Object;@1b5a2858"
//  }, {
//    "name" : "getDependences",
//    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependences()",
//    "value" : "[Ljava.lang.Object;@1b5a2858"
//  } ],
//  "----" : "-----------------我是一条华丽的分割线-----------------",
//  "fieldList" : [ {
//    "name" : "LOG",
//    "type" : "com.intellij.openapi.diagnostic.Logger",
//    "value" : "com.intellij.idea.IdeaLogger@7698a7bc"
//  }, {
//    "name" : "WEIGHT_BASE",
//    "type" : "int",
//    "value" : "10000"
//  }, {
//    "name" : "WEIGHT_INC",
//    "type" : "int",
//    "value" : "1000"
//  }, {
//    "name" : "myParent",
//    "type" : "com.intellij.database.psi.DbElement",
//    "value" : "schema:foodie-shop"
//  }, {
//    "name" : "myDelegate",
//    "type" : "java.lang.Object",
//    "value" : "carousel: table"
//  }, {
//    "name" : "myTransactionalVersion",
//    "type" : "long",
//    "value" : "15"
//  }, {
//    "name" : "ASYNC_DOC_CUT",
//    "type" : "java.lang.String",
//    "value" : "<!-- async-doc-cut -->"
//  }, {
//    "name" : "LOG",
//    "type" : "com.intellij.openapi.diagnostic.Logger",
//    "value" : "com.intellij.idea.IdeaLogger@6ecba29f"
//  }, {
//    "name" : "LOG",
//    "type" : "com.intellij.openapi.diagnostic.Logger",
//    "value" : "com.intellij.idea.IdeaLogger@78abf9dd"
//  }, {
//    "name" : "FLAGS_LOCKED",
//    "type" : "int",
//    "value" : "2048"
//  }, {
//    "name" : "ICON_COMPUTE",
//    "type" : "java.util.function.Function",
//    "value" : "com.intellij.psi.impl.ElementBase$$Lambda$1495/0x000000080140ec40@33ec0f00"
//  }, {
//    "name" : "VISIBILITY_ICON_PLACEHOLDER",
//    "type" : "com.intellij.openapi.util.NotNullLazyValue",
//    "value" : "com.intellij.psi.impl.ElementBase$1@7afb86"
//  }, {
//    "name" : "ICON_PLACEHOLDER",
//    "type" : "com.intellij.openapi.util.NotNullLazyValue",
//    "value" : "com.intellij.psi.impl.ElementBase$2@33966e4c"
//  }, {
//    "name" : "COPYABLE_USER_MAP_KEY",
//    "type" : "com.intellij.openapi.util.Key",
//    "value" : "COPYABLE_USER_MAP_KEY"
//  }, {
//    "name" : "myUserMap",
//    "type" : "com.intellij.util.keyFMap.KeyFMap",
//    "value" : "{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@31d03ae2, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@6da1c7fd, lastComputedIcon={0=Row icon. myIcons=[jar:file:/Applications/IntelliJ%20IDEA3.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg, null]}}"
//  }, {
//    "name" : "updater",
//    "type" : "com.intellij.util.concurrency.AtomicFieldUpdater",
//    "value" : "com.intellij.util.concurrency.AtomicFieldUpdater@14540cf2"
//  } ]
//}
//
////调试列原始对象
//{
//  "title" : "调试：com.intellij.database.psi.DbColumnImpl",
//  "methodList" : [ {
//    "name" : "getDefault",
//    "desc" : "public java.lang.String com.intellij.database.psi.DbColumnImpl.getDefault()",
//    "value" : null
//  }, {
//    "name" : "getParent",
//    "desc" : "public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getParent()",
//    "value" : "table:carousel"
//  }, {
//    "name" : "getParent",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbColumnImpl.getParent()",
//    "value" : "table:carousel"
//  }, {
//    "name" : "getParent",
//    "desc" : "public com.intellij.database.psi.DbElement com.intellij.database.psi.DbColumnImpl.getParent()",
//    "value" : "table:carousel"
//  }, {
//    "name" : "getParent",
//    "desc" : "public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbColumnImpl.getParent()",
//    "value" : "table:carousel"
//  }, {
//    "name" : "isNotNull",
//    "desc" : "public boolean com.intellij.database.psi.DbColumnImpl.isNotNull()",
//    "value" : "true"
//  }, {
//    "name" : "getTableName",
//    "desc" : "public java.lang.String com.intellij.database.psi.DbColumnImpl.getTableName()",
//    "value" : "carousel"
//  }, {
//    "name" : "getDocumentation",
//    "desc" : "public java.lang.CharSequence com.intellij.database.psi.DbColumnImpl.getDocumentation()",
//    "value" : "<html><body><b>Data Source:</b> database@localhost<br><b>Schema:</b> foodie-shop<br><b>Table:</b> carousel<br><b>Column:</b> id<br><br><font color=\"#808080\">-- 主键</font><br><code><pre><font color=\"#cc7832\">alter</font> <font color=\"#cc7832\">table</font> carousel\n    <font color=\"#cc7832\">add</font> id <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">64</font>) <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;主键&#39;</font><font color=\"#cc7832\">;</font>\n\n</pre></code>"
//  }, {
//    "name" : "getDocumentation",
//    "desc" : "public java.lang.StringBuilder com.intellij.database.psi.DbColumnImpl.getDocumentation()",
//    "value" : "<html><body><b>Data Source:</b> database@localhost<br><b>Schema:</b> foodie-shop<br><b>Table:</b> carousel<br><b>Column:</b> id<br><br><font color=\"#808080\">-- 主键</font><br><code><pre><font color=\"#cc7832\">alter</font> <font color=\"#cc7832\">table</font> carousel\n    <font color=\"#cc7832\">add</font> id <font color=\"#cc7832\">varchar</font>(<font color=\"#6897bb\">64</font>) <font color=\"#cc7832\">not</font> <font color=\"#cc7832\">null</font> <font color=\"#cc7832\">comment</font> <font color=\"#6a8759\">&#39;主键&#39;</font><font color=\"#cc7832\">;</font>\n\n</pre></code>"
//  }, {
//    "name" : "getDataType",
//    "desc" : "public com.intellij.database.model.DataType com.intellij.database.psi.DbColumnImpl.getDataType()",
//    "value" : "varchar(64)"
//  }, {
//    "name" : "getWeight",
//    "desc" : "public int com.intellij.database.psi.DbColumnImpl.getWeight()",
//    "value" : "10030"
//  }, {
//    "name" : "getTable",
//    "desc" : "public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getTable()",
//    "value" : "table:carousel"
//  }, {
//    "name" : "getTable",
//    "desc" : "public com.intellij.database.model.DasTable com.intellij.database.psi.DbColumnImpl.getTable()",
//    "value" : "table:carousel"
//  }, {
//    "name" : "getName",
//    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
//    "value" : "id"
//  }, {
//    "name" : "getName",
//    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
//    "value" : null
//  }, {
//    "name" : "getTypeName",
//    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
//    "value" : "column"
//  }, {
//    "name" : "init",
//    "desc" : "public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
//    "value" : null
//  }, {
//    "name" : "setName",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "getLanguage",
//    "desc" : "public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
//    "value" : "Language: SQL"
//  }, {
//    "name" : "getKind",
//    "desc" : "public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
//    "value" : "column"
//  }, {
//    "name" : "getProject",
//    "desc" : "public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
//    "value" : "Project '/Users/adamchang/cgh/code/test/demo/springbooteasycode' springbooteasycode"
//  }, {
//    "name" : "getText",
//    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
//    "value" : "alter table carousel\n    add id varchar(64) not null comment '主键';\n\n"
//  }, {
//    "name" : "navigate",
//    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],boolean,com.intellij.database.util.DbImplUtil$TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
//    "value" : null
//  }, {
//    "name" : "navigate",
//    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
//    "value" : null
//  }, {
//    "name" : "navigate",
//    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],com.intellij.database.util.DbImplUtil$TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
//    "value" : null
//  }, {
//    "name" : "isCaseSensitive",
//    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
//    "value" : "false"
//  }, {
//    "name" : "getVirtualFile",
//    "desc" : "public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
//    "value" : "DB VirtualFile: column, foodie-shop.carousel.id [database@localhost] (Valid)"
//  }, {
//    "name" : "processChildren",
//    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<com.intellij.psi.PsiFileSystemItem>)",
//    "value" : null
//  }, {
//    "name" : "getMetaData",
//    "desc" : "public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
//    "value" : "column:id"
//  }, {
//    "name" : "getDelegate",
//    "desc" : "public D com.intellij.database.psi.DbElementImpl.getDelegate()",
//    "value" : "id: column"
//  }, {
//    "name" : "getDasChildren",
//    "desc" : "public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
//    "value" : null
//  }, {
//    "name" : "getDasParent",
//    "desc" : "public P com.intellij.database.psi.DbElementImpl.getDasParent()",
//    "value" : "table:carousel"
//  }, {
//    "name" : "getDasParent",
//    "desc" : "public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
//    "value" : "table:carousel"
//  }, {
//    "name" : "getLocationString",
//    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
//    "value" : "foodie-shop.carousel [database@localhost]"
//  }, {
//    "name" : "checkSetName",
//    "desc" : "public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "canNavigate",
//    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
//    "value" : null
//  }, {
//    "name" : "canNavigateToSource",
//    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
//    "value" : null
//  }, {
//    "name" : "acceptChildren",
//    "desc" : "public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
//    "value" : null
//  }, {
//    "name" : "processDeclarations",
//    "desc" : "public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
//    "value" : null
//  }, {
//    "name" : "getDataSource",
//    "desc" : "public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
//    "value" : "root:database@localhost"
//  }, {
//    "name" : "getDataSource",
//    "desc" : "public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
//    "value" : "root:database@localhost"
//  }, {
//    "name" : "getBaseIcon",
//    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
//    "value" : "jar:file:/Applications/IntelliJ%20IDEA3.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/col.svg"
//  }, {
//    "name" : "createDeclarationProcessor",
//    "desc" : "public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
//    "value" : null
//  }, {
//    "name" : "newDeclarationProcessor",
//    "desc" : "public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement)",
//    "value" : null
//  }, {
//    "name" : "getIcon",
//    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
//    "value" : null
//  }, {
//    "name" : "getIcon",
//    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
//    "value" : "Deferred. Base=jar:file:/Applications/IntelliJ%20IDEA3.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/col.svg"
//  }, {
//    "name" : "getManager",
//    "desc" : "public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
//    "value" : "com.intellij.psi.impl.PsiManagerImpl@2adece73"
//  }, {
//    "name" : "getDeclaration",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
//    "value" : "column:id"
//  }, {
//    "name" : "isValid",
//    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isValid()",
//    "value" : "true"
//  }, {
//    "name" : "getPosition",
//    "desc" : "public short com.intellij.database.psi.DbElementImpl.getPosition()",
//    "value" : "1"
//  }, {
//    "name" : "getComment",
//    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
//    "value" : "主键"
//  }, {
//    "name" : "getChildren",
//    "desc" : "public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
//    "value" : "[Lcom.intellij.psi.PsiElement;@46f60f6e"
//  }, {
//    "name" : "isWritable",
//    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
//    "value" : "true"
//  }, {
//    "name" : "isDirectory",
//    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
//    "value" : "false"
//  }, {
//    "name" : "getNode",
//    "desc" : "public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
//    "value" : null
//  }, {
//    "name" : "isPhysical",
//    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
//    "value" : "false"
//  }, {
//    "name" : "getPrevSibling",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
//    "value" : null
//  }, {
//    "name" : "findElementAt",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
//    "value" : null
//  }, {
//    "name" : "getFirstChild",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
//    "value" : null
//  }, {
//    "name" : "getNextSibling",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
//    "value" : null
//  }, {
//    "name" : "getPresentation",
//    "desc" : "public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
//    "value" : "column:id"
//  }, {
//    "name" : "getPresentableText",
//    "desc" : "public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
//    "value" : "id"
//  }, {
//    "name" : "getTextRange",
//    "desc" : "public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
//    "value" : null
//  }, {
//    "name" : "getStartOffsetInParent",
//    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
//    "value" : "0"
//  }, {
//    "name" : "getTextOffset",
//    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
//    "value" : "0"
//  }, {
//    "name" : "textToCharArray",
//    "desc" : "public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
//    "value" : null
//  }, {
//    "name" : "textContains",
//    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
//    "value" : null
//  }, {
//    "name" : "getIcon",
//    "desc" : "public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
//    "value" : null
//  }, {
//    "name" : "getLastChild",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
//    "value" : null
//  }, {
//    "name" : "getTextLength",
//    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
//    "value" : "0"
//  }, {
//    "name" : "add",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "replace",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "checkDelete",
//    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "delete",
//    "desc" : "public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "accept",
//    "desc" : "public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
//    "value" : null
//  }, {
//    "name" : "getContext",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
//    "value" : "table:carousel"
//  }, {
//    "name" : "copy",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
//    "value" : null
//  }, {
//    "name" : "addBefore",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "addAfter",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "checkAdd",
//    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "getReferences",
//    "desc" : "public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
//    "value" : "[Lcom.intellij.psi.PsiReference;@12def38f"
//  }, {
//    "name" : "getContainingFile",
//    "desc" : "public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
//    "value" : null
//  }, {
//    "name" : "findReferenceAt",
//    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
//    "value" : null
//  }, {
//    "name" : "getNavigationElement",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
//    "value" : "column:id"
//  }, {
//    "name" : "getOriginalElement",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
//    "value" : "column:id"
//  }, {
//    "name" : "textMatches",
//    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
//    "value" : null
//  }, {
//    "name" : "textMatches",
//    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
//    "value" : null
//  }, {
//    "name" : "addRangeBefore",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "addRangeAfter",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "deleteChildRange",
//    "desc" : "public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "getReference",
//    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
//    "value" : null
//  }, {
//    "name" : "getResolveScope",
//    "desc" : "public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
//    "value" : "Project and Libraries"
//  }, {
//    "name" : "getUseScope",
//    "desc" : "public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
//    "value" : "Project and Libraries"
//  }, {
//    "name" : "isEquivalentTo",
//    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
//    "value" : null
//  }, {
//    "name" : "addRange",
//    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
//    "value" : null
//  }, {
//    "name" : "createLayeredIcon",
//    "desc" : "public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.createLayeredIcon(com.intellij.openapi.util.Iconable,javax.swing.Icon,int)",
//    "value" : null
//  }, {
//    "name" : "registerIconLayer",
//    "desc" : "public static void com.intellij.psi.impl.ElementBase.registerIconLayer(int,javax.swing.Icon)",
//    "value" : null
//  }, {
//    "name" : "transformFlags",
//    "desc" : "public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
//    "value" : null
//  }, {
//    "name" : "isNativeFileType",
//    "desc" : "public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
//    "value" : null
//  }, {
//    "name" : "overlayIcons",
//    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.overlayIcons(javax.swing.Icon...)",
//    "value" : null
//  }, {
//    "name" : "buildRowIcon",
//    "desc" : "public static com.intellij.ui.icons.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
//    "value" : null
//  }, {
//    "name" : "iconWithVisibilityIfNeeded",
//    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
//    "value" : null
//  }, {
//    "name" : "replace",
//    "desc" : "public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
//    "value" : null
//  }, {
//    "name" : "getUserData",
//    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
//    "value" : null
//  }, {
//    "name" : "putUserData",
//    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
//    "value" : null
//  }, {
//    "name" : "getUserDataString",
//    "desc" : "public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
//    "value" : "{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@17d66b3f}"
//  }, {
//    "name" : "copyUserDataTo",
//    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
//    "value" : null
//  }, {
//    "name" : "getCopyableUserData",
//    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
//    "value" : null
//  }, {
//    "name" : "putCopyableUserData",
//    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
//    "value" : null
//  }, {
//    "name" : "putUserDataIfAbsent",
//    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
//    "value" : null
//  }, {
//    "name" : "copyCopyableDataTo",
//    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
//    "value" : null
//  }, {
//    "name" : "isUserDataEmpty",
//    "desc" : "public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
//    "value" : "false"
//  }, {
//    "name" : "getTextRangeInParent",
//    "desc" : "public default com.intellij.openapi.util.TextRange com.intellij.psi.PsiElement.getTextRangeInParent()",
//    "value" : "(0,0)"
//  }, {
//    "name" : "getDbParent",
//    "desc" : "public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
//    "value" : "table:carousel"
//  }, {
//    "name" : "getDbChildren",
//    "desc" : "public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
//    "value" : null
//  }, {
//    "name" : "getDependencies",
//    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependencies()",
//    "value" : "[Ljava.lang.Object;@1b5a2858"
//  }, {
//    "name" : "getDependences",
//    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependences()",
//    "value" : "[Ljava.lang.Object;@1b5a2858"
//  } ],
//  "----" : "-----------------我是一条华丽的分割线-----------------",
//  "fieldList" : [ {
//    "name" : "LOG",
//    "type" : "com.intellij.openapi.diagnostic.Logger",
//    "value" : "com.intellij.idea.IdeaLogger@7698a7bc"
//  }, {
//    "name" : "WEIGHT_BASE",
//    "type" : "int",
//    "value" : "10000"
//  }, {
//    "name" : "WEIGHT_INC",
//    "type" : "int",
//    "value" : "1000"
//  }, {
//    "name" : "myParent",
//    "type" : "com.intellij.database.psi.DbElement",
//    "value" : "table:carousel"
//  }, {
//    "name" : "myDelegate",
//    "type" : "java.lang.Object",
//    "value" : "id: column"
//  }, {
//    "name" : "myTransactionalVersion",
//    "type" : "long",
//    "value" : "15"
//  }, {
//    "name" : "ASYNC_DOC_CUT",
//    "type" : "java.lang.String",
//    "value" : "<!-- async-doc-cut -->"
//  }, {
//    "name" : "LOG",
//    "type" : "com.intellij.openapi.diagnostic.Logger",
//    "value" : "com.intellij.idea.IdeaLogger@6ecba29f"
//  }, {
//    "name" : "LOG",
//    "type" : "com.intellij.openapi.diagnostic.Logger",
//    "value" : "com.intellij.idea.IdeaLogger@78abf9dd"
//  }, {
//    "name" : "FLAGS_LOCKED",
//    "type" : "int",
//    "value" : "2048"
//  }, {
//    "name" : "ICON_COMPUTE",
//    "type" : "java.util.function.Function",
//    "value" : "com.intellij.psi.impl.ElementBase$$Lambda$1495/0x000000080140ec40@33ec0f00"
//  }, {
//    "name" : "VISIBILITY_ICON_PLACEHOLDER",
//    "type" : "com.intellij.openapi.util.NotNullLazyValue",
//    "value" : "com.intellij.psi.impl.ElementBase$1@7afb86"
//  }, {
//    "name" : "ICON_PLACEHOLDER",
//    "type" : "com.intellij.openapi.util.NotNullLazyValue",
//    "value" : "com.intellij.psi.impl.ElementBase$2@33966e4c"
//  }, {
//    "name" : "COPYABLE_USER_MAP_KEY",
//    "type" : "com.intellij.openapi.util.Key",
//    "value" : "COPYABLE_USER_MAP_KEY"
//  }, {
//    "name" : "myUserMap",
//    "type" : "com.intellij.util.keyFMap.KeyFMap",
//    "value" : "{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@17d66b3f}"
//  }, {
//    "name" : "updater",
//    "type" : "com.intellij.util.concurrency.AtomicFieldUpdater",
//    "value" : "com.intellij.util.concurrency.AtomicFieldUpdater@14540cf2"
//  } ]
//}
//
////调试列原始列类型
//{
//  "title" : "调试：com.intellij.database.model.DataType",
//  "methodList" : [ {
//    "name" : "getLength",
//    "desc" : "public int com.intellij.database.model.DataType.getLength()",
//    "value" : "64"
//  }, {
//    "name" : "getScale",
//    "desc" : "public int com.intellij.database.model.DataType.getScale()",
//    "value" : "0"
//  }, {
//    "name" : "getSpecification",
//    "desc" : "public java.lang.String com.intellij.database.model.DataType.getSpecification(boolean,boolean)",
//    "value" : null
//  }, {
//    "name" : "getSpecification",
//    "desc" : "public java.lang.String com.intellij.database.model.DataType.getSpecification()",
//    "value" : "varchar(64)"
//  }, {
//    "name" : "withTypeName",
//    "desc" : "public com.intellij.database.model.DataType com.intellij.database.model.DataType.withTypeName(java.lang.String)",
//    "value" : null
//  }, {
//    "name" : "equalsWithoutJdbc",
//    "desc" : "public boolean com.intellij.database.model.DataType.equalsWithoutJdbc(com.intellij.database.model.DataType)",
//    "value" : null
//  }, {
//    "name" : "getPrecision",
//    "desc" : "public int com.intellij.database.model.DataType.getPrecision()",
//    "value" : "64"
//  } ],
//  "----" : "-----------------我是一条华丽的分割线-----------------",
//  "fieldList" : [ {
//    "name" : "MAX_SIZE",
//    "type" : "int",
//    "value" : "2147483647"
//  }, {
//    "name" : "STAR_SIZE",
//    "type" : "int",
//    "value" : "2147483646"
//  }, {
//    "name" : "NO_SIZE",
//    "type" : "int",
//    "value" : "-1"
//  }, {
//    "name" : "NO_SCALE",
//    "type" : "int",
//    "value" : "0"
//  }, {
//    "name" : "UNKNOWN",
//    "type" : "com.intellij.database.model.DataType",
//    "value" : "unknown"
//  }, {
//    "name" : "schemaName",
//    "type" : "java.lang.String",
//    "value" : null
//  }, {
//    "name" : "packageName",
//    "type" : "java.lang.String",
//    "value" : null
//  }, {
//    "name" : "typeName",
//    "type" : "java.lang.String",
//    "value" : "varchar"
//  }, {
//    "name" : "size",
//    "type" : "int",
//    "value" : "64"
//  }, {
//    "name" : "scale",
//    "type" : "int",
//    "value" : "0"
//  }, {
//    "name" : "sizeUnit",
//    "type" : "com.intellij.database.model.LengthUnit",
//    "value" : "com.intellij.database.model.LengthUnit@2dd72097"
//  }, {
//    "name" : "vagueArg",
//    "type" : "java.lang.String",
//    "value" : null
//  }, {
//    "name" : "suffix",
//    "type" : "java.lang.String",
//    "value" : null
//  }, {
//    "name" : "sizeUnitExplicit",
//    "type" : "boolean",
//    "value" : "false"
//  }, {
//    "name" : "custom",
//    "type" : "boolean",
//    "value" : "false"
//  }, {
//    "name" : "enumValues",
//    "type" : "java.util.List",
//    "value" : null
//  }, {
//    "name" : "jdbcType",
//    "type" : "int",
//    "value" : "0"
//  } ]
//}
//
////获取原始列类型中的字段
//sqlType = varchar
//
////执行原始列类型中的方法
//sqlTypeLen = 64