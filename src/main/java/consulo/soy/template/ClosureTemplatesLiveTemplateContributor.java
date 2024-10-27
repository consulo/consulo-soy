package consulo.soy.template;

import com.google.bamboo.soy.templates.CallBlockContext;
import com.google.bamboo.soy.templates.TemplateBlockContext;
import com.google.bamboo.soy.templates.TopLevelContext;
import consulo.annotation.component.ExtensionImpl;
import consulo.language.editor.template.LiveTemplateContributor;
import consulo.localize.LocalizeValue;
import jakarta.annotation.Nonnull;

@ExtensionImpl
public class ClosureTemplatesLiveTemplateContributor implements LiveTemplateContributor {
    @Override
    @Nonnull
    public String groupId() {
        return "closuretemplates";
    }

    @Override
    @Nonnull
    public LocalizeValue groupName() {
        return LocalizeValue.localizeTODO("ClosureTemplates");
    }

    @Override
    public void contribute(@Nonnull LiveTemplateContributor.Factory factory) {
        try (Builder builder = factory.newBuilder("closuretemplates{namespace", "{namespace", "{namespace $NAME$}$END$", LocalizeValue.localizeTODO("Package namespace declaration"))) {
            builder.withVariable("NAME", "", "", true);

            builder.withContext(TopLevelContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{alias", "{alias", "{alias $NAME$ as $END$}", LocalizeValue.localizeTODO("Alias declaration"))) {
            builder.withVariable("NAME", "complete()", "", true);

            builder.withContext(TopLevelContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{template", "{template", "{template $NAME$}$END${/template}", LocalizeValue.localizeTODO("Template definition"))) {
            builder.withVariable("NAME", "", "", true);

            builder.withContext(TopLevelContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{deltemplate", "{deltemplate", "{deltemplate $NAME$}$END${/deltemplate}", LocalizeValue.localizeTODO("Deltemplate definition"))) {
            builder.withVariable("NAME", "", "", true);

            builder.withContext(TopLevelContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{let}{/let}", "{let}{/let}", "{let $NAME$ kind=\"$KIND$\"}$END${/let}", LocalizeValue.localizeTODO("Let declaration"))) {
            builder.withVariable("NAME", "complete()", "", true);
            builder.withVariable("KIND", "complete()", "\"text\"", true);

            builder.withContext(CallBlockContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{slet/}", "{slet/}", "{let $NAME$: $END$ /}", LocalizeValue.localizeTODO("Let declaration self-closing"))) {
            builder.withVariable("NAME", "complete()", "", true);

            builder.withContext(CallBlockContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{param}{/param}", "{param}{/param}", "{param $NAME$ kind=\"$KIND$\"}$END${/param}", LocalizeValue.localizeTODO("Template parameter"))) {
            builder.withVariable("NAME", "complete()", "", true);
            builder.withVariable("KIND", "complete()", "\"text\"", true);

            builder.withContext(CallBlockContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{sparam/}", "{sparam/}", "{param $NAME$: $END$ /}", LocalizeValue.localizeTODO("Template parameter self-closing"))) {
            builder.withVariable("NAME", "complete()", "", true);

            builder.withContext(CallBlockContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{@param", "{@param", "{@param $NAME$: $TYPE$}$END$", LocalizeValue.localizeTODO("Parameter definition"))) {
            builder.withVariable("NAME", "", "", true);
            builder.withVariable("TYPE", "", "", true);

            builder.withContext(TemplateBlockContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{call}{/call}", "{call}{/call}", "{call $NAME$}$END${/call}", LocalizeValue.localizeTODO("Template call"))) {
            builder.withVariable("NAME", "", "", true);

            builder.withContext(TemplateBlockContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{scall/}", "{scall/}", "{call $NAME$ /}$END$", LocalizeValue.localizeTODO("Template call self-closing"))) {
            builder.withVariable("NAME", "", "", true);

            builder.withContext(TemplateBlockContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{delcall}{/delcall}", "{delcall}{/delcall}", "{delcall $NAME$}$END${/delcall}", LocalizeValue.localizeTODO("Deltemplate call"))) {
            builder.withVariable("NAME", "", "", true);

            builder.withContext(TemplateBlockContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{sdelcall/}", "{sdelcall/}", "{delcall $NAME$ /}$END$", LocalizeValue.localizeTODO("Deltemplate call self-closing"))) {
            builder.withVariable("NAME", "", "", true);

            builder.withContext(TemplateBlockContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{xid('')}", "{xid('')}", "{xid('$ID$')}$END$", LocalizeValue.localizeTODO("Xid function call"))) {
            builder.withVariable("ID", "", "", true);

            builder.withContext(TemplateBlockContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{css('')}", "{css('')}", "{css('%$NAME$')}$END$", LocalizeValue.localizeTODO("Css function call"))) {
            builder.withVariable("NAME", "", "", true);

            builder.withContext(TemplateBlockContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{literal", "{literal", "{literal}$END${/literal}", LocalizeValue.localizeTODO("Literal block"))) {
            builder.withContext(TemplateBlockContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{msg", "{msg", "{msg desc=\"$DESC$\"}$END${/msg}", LocalizeValue.localizeTODO("Message"))) {
            builder.withVariable("DESC", "", "", true);

            builder.withContext(TemplateBlockContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{foreach", "{foreach", "{foreach $OPERAND$ in $OPERANDS$}$END${/foreach}", LocalizeValue.localizeTODO("Foreach loop"))) {
            builder.withVariable("OPERAND", "", "", true);
            builder.withVariable("OPERANDS", "", "", true);

            builder.withContext(TemplateBlockContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{if", "{if", "{if $CONDITION$}$END${/if}", LocalizeValue.localizeTODO("If condition"))) {
            builder.withVariable("CONDITION", "complete()", "", true);

            builder.withContext(TemplateBlockContext.class, true);
        }

        try (Builder builder = factory.newBuilder("closuretemplates{ifelse", "{ifelse", "{if $CONDITION$}$END${else}{/if}", LocalizeValue.localizeTODO("If-else condition"))) {
            builder.withVariable("CONDITION", "complete()", "", true);

            builder.withContext(TemplateBlockContext.class, true);
        }

    }
}
