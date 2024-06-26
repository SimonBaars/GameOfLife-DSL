/*
 * generated by Xtext 2.19.0
 */
package persons.tasks.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import persons.tasks.ide.contentassist.antlr.internal.InternalTaskDSLParser;
import persons.tasks.services.TaskDSLGrammarAccess;

public class TaskDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TaskDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TaskDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPlanningAccess().getAlternatives_3(), "rule__Planning__Alternatives_3");
			builder.put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
			builder.put(grammarAccess.getBooleanExpressionLevel2Access().getAlternatives(), "rule__BooleanExpressionLevel2__Alternatives");
			builder.put(grammarAccess.getBooleanExpressionLevel3Access().getAlternatives(), "rule__BooleanExpressionLevel3__Alternatives");
			builder.put(grammarAccess.getExpressionLevel1Access().getAlternatives_1(), "rule__ExpressionLevel1__Alternatives_1");
			builder.put(grammarAccess.getExpressionLevel2Access().getAlternatives_1(), "rule__ExpressionLevel2__Alternatives_1");
			builder.put(grammarAccess.getExpressionLevel4Access().getAlternatives(), "rule__ExpressionLevel4__Alternatives");
			builder.put(grammarAccess.getExpressionLevel5Access().getAlternatives(), "rule__ExpressionLevel5__Alternatives");
			builder.put(grammarAccess.getBinaryBooleanOperatorAccess().getAlternatives(), "rule__BinaryBooleanOperator__Alternatives");
			builder.put(grammarAccess.getCompareOperatorAccess().getAlternatives(), "rule__CompareOperator__Alternatives");
			builder.put(grammarAccess.getTimeUnitAccess().getAlternatives(), "rule__TimeUnit__Alternatives");
			builder.put(grammarAccess.getPlanningAccess().getGroup(), "rule__Planning__Group__0");
			builder.put(grammarAccess.getPersonAccess().getGroup(), "rule__Person__Group__0");
			builder.put(grammarAccess.getTaskAccess().getGroup(), "rule__Task__Group__0");
			builder.put(grammarAccess.getTaskAccess().getGroup_7(), "rule__Task__Group_7__0");
			builder.put(grammarAccess.getTaskAccess().getGroup_12(), "rule__Task__Group_12__0");
			builder.put(grammarAccess.getDurationAccess().getGroup(), "rule__Duration__Group__0");
			builder.put(grammarAccess.getLunchActionAccess().getGroup(), "rule__LunchAction__Group__0");
			builder.put(grammarAccess.getMeetingActionAccess().getGroup(), "rule__MeetingAction__Group__0");
			builder.put(grammarAccess.getPaperActionAccess().getGroup(), "rule__PaperAction__Group__0");
			builder.put(grammarAccess.getPaymentActionAccess().getGroup(), "rule__PaymentAction__Group__0");
			builder.put(grammarAccess.getPaymentActionAccess().getGroup_0(), "rule__PaymentAction__Group_0__0");
			builder.put(grammarAccess.getBooleanExpressionLevel1Access().getGroup(), "rule__BooleanExpressionLevel1__Group__0");
			builder.put(grammarAccess.getBooleanExpressionLevel1Access().getGroup_1(), "rule__BooleanExpressionLevel1__Group_1__0");
			builder.put(grammarAccess.getNotExpressionAccess().getGroup(), "rule__NotExpression__Group__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup(), "rule__ComparisonExpression__Group__0");
			builder.put(grammarAccess.getBooleanExpressionBracketAccess().getGroup(), "rule__BooleanExpressionBracket__Group__0");
			builder.put(grammarAccess.getExpressionLevel1Access().getGroup(), "rule__ExpressionLevel1__Group__0");
			builder.put(grammarAccess.getExpressionLevel1Access().getGroup_1_0(), "rule__ExpressionLevel1__Group_1_0__0");
			builder.put(grammarAccess.getExpressionLevel1Access().getGroup_1_1(), "rule__ExpressionLevel1__Group_1_1__0");
			builder.put(grammarAccess.getExpressionLevel2Access().getGroup(), "rule__ExpressionLevel2__Group__0");
			builder.put(grammarAccess.getExpressionLevel2Access().getGroup_1_0(), "rule__ExpressionLevel2__Group_1_0__0");
			builder.put(grammarAccess.getExpressionLevel2Access().getGroup_1_1(), "rule__ExpressionLevel2__Group_1_1__0");
			builder.put(grammarAccess.getExpressionLevel2Access().getGroup_1_2(), "rule__ExpressionLevel2__Group_1_2__0");
			builder.put(grammarAccess.getExpressionLevel2Access().getGroup_1_3(), "rule__ExpressionLevel2__Group_1_3__0");
			builder.put(grammarAccess.getExpressionLevel2Access().getGroup_1_4(), "rule__ExpressionLevel2__Group_1_4__0");
			builder.put(grammarAccess.getExpressionLevel3Access().getGroup(), "rule__ExpressionLevel3__Group__0");
			builder.put(grammarAccess.getExpressionLevel3Access().getGroup_1(), "rule__ExpressionLevel3__Group_1__0");
			builder.put(grammarAccess.getExpressionMinusAccess().getGroup(), "rule__ExpressionMinus__Group__0");
			builder.put(grammarAccess.getExpressionPlusAccess().getGroup(), "rule__ExpressionPlus__Group__0");
			builder.put(grammarAccess.getExpressionBracketAccess().getGroup(), "rule__ExpressionBracket__Group__0");
			builder.put(grammarAccess.getPlanningAccess().getNameAssignment_1(), "rule__Planning__NameAssignment_1");
			builder.put(grammarAccess.getPlanningAccess().getAnonymousAssignment_2(), "rule__Planning__AnonymousAssignment_2");
			builder.put(grammarAccess.getPlanningAccess().getPersonsAssignment_3_0(), "rule__Planning__PersonsAssignment_3_0");
			builder.put(grammarAccess.getPlanningAccess().getTasksAssignment_3_1(), "rule__Planning__TasksAssignment_3_1");
			builder.put(grammarAccess.getPersonAccess().getNameAssignment_1(), "rule__Person__NameAssignment_1");
			builder.put(grammarAccess.getTaskAccess().getNameAssignment_1(), "rule__Task__NameAssignment_1");
			builder.put(grammarAccess.getTaskAccess().getActionAssignment_2(), "rule__Task__ActionAssignment_2");
			builder.put(grammarAccess.getTaskAccess().getPersonsAssignment_4(), "rule__Task__PersonsAssignment_4");
			builder.put(grammarAccess.getTaskAccess().getPrioAssignment_6(), "rule__Task__PrioAssignment_6");
			builder.put(grammarAccess.getTaskAccess().getDurationAssignment_7_1(), "rule__Task__DurationAssignment_7_1");
			builder.put(grammarAccess.getTaskAccess().getProjectsAssignment_9(), "rule__Task__ProjectsAssignment_9");
			builder.put(grammarAccess.getTaskAccess().getUseAssignment_11(), "rule__Task__UseAssignment_11");
			builder.put(grammarAccess.getTaskAccess().getExtendsAssignment_12_1(), "rule__Task__ExtendsAssignment_12_1");
			builder.put(grammarAccess.getProjectAccess().getNameAssignment(), "rule__Project__NameAssignment");
			builder.put(grammarAccess.getProjectUseAccess().getProjectAssignment(), "rule__ProjectUse__ProjectAssignment");
			builder.put(grammarAccess.getDurationAccess().getDlAssignment_0(), "rule__Duration__DlAssignment_0");
			builder.put(grammarAccess.getDurationAccess().getUnitAssignment_1(), "rule__Duration__UnitAssignment_1");
			builder.put(grammarAccess.getLunchActionAccess().getLocationAssignment_1(), "rule__LunchAction__LocationAssignment_1");
			builder.put(grammarAccess.getMeetingActionAccess().getTopicAssignment_1(), "rule__MeetingAction__TopicAssignment_1");
			builder.put(grammarAccess.getPaperActionAccess().getReportAssignment_1(), "rule__PaperAction__ReportAssignment_1");
			builder.put(grammarAccess.getPaymentActionAccess().getConditionAssignment_0_1(), "rule__PaymentAction__ConditionAssignment_0_1");
			builder.put(grammarAccess.getPaymentActionAccess().getAmountAssignment_2(), "rule__PaymentAction__AmountAssignment_2");
			builder.put(grammarAccess.getBooleanExpressionLevel1Access().getBopAssignment_1_1(), "rule__BooleanExpressionLevel1__BopAssignment_1_1");
			builder.put(grammarAccess.getBooleanExpressionLevel1Access().getRightAssignment_1_2(), "rule__BooleanExpressionLevel1__RightAssignment_1_2");
			builder.put(grammarAccess.getNotExpressionAccess().getSubAssignment_1(), "rule__NotExpression__SubAssignment_1");
			builder.put(grammarAccess.getComparisonExpressionAccess().getLeftAssignment_1(), "rule__ComparisonExpression__LeftAssignment_1");
			builder.put(grammarAccess.getComparisonExpressionAccess().getOpAssignment_2(), "rule__ComparisonExpression__OpAssignment_2");
			builder.put(grammarAccess.getComparisonExpressionAccess().getRightAssignment_3(), "rule__ComparisonExpression__RightAssignment_3");
			builder.put(grammarAccess.getBooleanExpressionBracketAccess().getSubAssignment_1(), "rule__BooleanExpressionBracket__SubAssignment_1");
			builder.put(grammarAccess.getBooleanExpressionConstantAccess().getValueAssignment(), "rule__BooleanExpressionConstant__ValueAssignment");
			builder.put(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2(), "rule__ExpressionLevel1__RightAssignment_1_0_2");
			builder.put(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2(), "rule__ExpressionLevel1__RightAssignment_1_1_2");
			builder.put(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2(), "rule__ExpressionLevel2__RightAssignment_1_0_2");
			builder.put(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2(), "rule__ExpressionLevel2__RightAssignment_1_1_2");
			builder.put(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_2_2(), "rule__ExpressionLevel2__RightAssignment_1_2_2");
			builder.put(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_3_2(), "rule__ExpressionLevel2__RightAssignment_1_3_2");
			builder.put(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_4_2(), "rule__ExpressionLevel2__RightAssignment_1_4_2");
			builder.put(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2(), "rule__ExpressionLevel3__RightAssignment_1_2");
			builder.put(grammarAccess.getExpressionMinusAccess().getSubAssignment_1(), "rule__ExpressionMinus__SubAssignment_1");
			builder.put(grammarAccess.getExpressionPlusAccess().getSubAssignment_1(), "rule__ExpressionPlus__SubAssignment_1");
			builder.put(grammarAccess.getExpressionBracketAccess().getSubAssignment_1(), "rule__ExpressionBracket__SubAssignment_1");
			builder.put(grammarAccess.getExpressionConstantIntAccess().getValueAssignment(), "rule__ExpressionConstantInt__ValueAssignment");
			builder.put(grammarAccess.getExpressionBalanceAccess().getValueAssignment(), "rule__ExpressionBalance__ValueAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TaskDSLGrammarAccess grammarAccess;

	@Override
	protected InternalTaskDSLParser createParser() {
		InternalTaskDSLParser result = new InternalTaskDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TaskDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TaskDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
