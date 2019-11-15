/*
 * generated by Xtext 2.19.0
 */
package com.simonbaars.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.simonbaars.ide.contentassist.antlr.internal.InternalGoLDSLParser;
import com.simonbaars.services.GoLDSLGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class GoLDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GoLDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GoLDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDSLAccess().getAlternatives_1(), "rule__DSL__Alternatives_1");
			builder.put(grammarAccess.getObjectsAccess().getAlternatives(), "rule__Objects__Alternatives");
			builder.put(grammarAccess.getConditionRuleAccess().getAlternatives(), "rule__ConditionRule__Alternatives");
			builder.put(grammarAccess.getRangeAccess().getAlternatives(), "rule__Range__Alternatives");
			builder.put(grammarAccess.getUnboundedRangeAccess().getAlternatives(), "rule__UnboundedRange__Alternatives");
			builder.put(grammarAccess.getBoolOperatorAccess().getAlternatives(), "rule__BoolOperator__Alternatives");
			builder.put(grammarAccess.getGridPartAccess().getAlternatives(), "rule__GridPart__Alternatives");
			builder.put(grammarAccess.getDSLAccess().getGroup(), "rule__DSL__Group__0");
			builder.put(grammarAccess.getBoardAccess().getGroup(), "rule__Board__Group__0");
			builder.put(grammarAccess.getShapeDefAccess().getGroup(), "rule__ShapeDef__Group__0");
			builder.put(grammarAccess.getCellPairsAccess().getGroup(), "rule__CellPairs__Group__0");
			builder.put(grammarAccess.getCellsAccess().getGroup(), "rule__Cells__Group__0");
			builder.put(grammarAccess.getCellDefAccess().getGroup(), "rule__CellDef__Group__0");
			builder.put(grammarAccess.getShapeRefAccess().getGroup(), "rule__ShapeRef__Group__0");
			builder.put(grammarAccess.getCellAccess().getGroup(), "rule__Cell__Group__0");
			builder.put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
			builder.put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
			builder.put(grammarAccess.getConditionRulesAccess().getGroup(), "rule__ConditionRules__Group__0");
			builder.put(grammarAccess.getConditionRulesAccess().getGroup_1(), "rule__ConditionRules__Group_1__0");
			builder.put(grammarAccess.getBoundedRangeAccess().getGroup(), "rule__BoundedRange__Group__0");
			builder.put(grammarAccess.getLeftUnboundedRangeAccess().getGroup(), "rule__LeftUnboundedRange__Group__0");
			builder.put(grammarAccess.getRightUnboundedRangeAccess().getGroup(), "rule__RightUnboundedRange__Group__0");
			builder.put(grammarAccess.getGridAccess().getGroup(), "rule__Grid__Group__0");
			builder.put(grammarAccess.getOffsetAccess().getGroup(), "rule__Offset__Group__0");
			builder.put(grammarAccess.getSizeAccess().getGroup(), "rule__Size__Group__0");
			builder.put(grammarAccess.getDSLAccess().getBoardAssignment_0(), "rule__DSL__BoardAssignment_0");
			builder.put(grammarAccess.getDSLAccess().getRulesAssignment_1_0(), "rule__DSL__RulesAssignment_1_0");
			builder.put(grammarAccess.getDSLAccess().getShapesAssignment_1_1(), "rule__DSL__ShapesAssignment_1_1");
			builder.put(grammarAccess.getObjectsAccess().getShapesAssignment_0(), "rule__Objects__ShapesAssignment_0");
			builder.put(grammarAccess.getObjectsAccess().getCellAssignment_1(), "rule__Objects__CellAssignment_1");
			builder.put(grammarAccess.getObjectsAccess().getCellsAssignment_2(), "rule__Objects__CellsAssignment_2");
			builder.put(grammarAccess.getObjectsAccess().getGridsAssignment_3(), "rule__Objects__GridsAssignment_3");
			builder.put(grammarAccess.getShapeDefAccess().getNameAssignment_1(), "rule__ShapeDef__NameAssignment_1");
			builder.put(grammarAccess.getShapeDefAccess().getOffsetAssignment_3(), "rule__ShapeDef__OffsetAssignment_3");
			builder.put(grammarAccess.getShapeDefAccess().getObjectsAssignment_4(), "rule__ShapeDef__ObjectsAssignment_4");
			builder.put(grammarAccess.getCellPairsAccess().getCellsAssignment_1(), "rule__CellPairs__CellsAssignment_1");
			builder.put(grammarAccess.getShapeRefAccess().getNameAssignment_1(), "rule__ShapeRef__NameAssignment_1");
			builder.put(grammarAccess.getShapeRefAccess().getXAssignment_3(), "rule__ShapeRef__XAssignment_3");
			builder.put(grammarAccess.getShapeRefAccess().getYAssignment_5(), "rule__ShapeRef__YAssignment_5");
			builder.put(grammarAccess.getCellAccess().getXAssignment_0(), "rule__Cell__XAssignment_0");
			builder.put(grammarAccess.getCellAccess().getYAssignment_2(), "rule__Cell__YAssignment_2");
			builder.put(grammarAccess.getRuleAccess().getConditionAssignment_1(), "rule__Rule__ConditionAssignment_1");
			builder.put(grammarAccess.getRuleAccess().getActionAssignment_2(), "rule__Rule__ActionAssignment_2");
			builder.put(grammarAccess.getConditionRuleAccess().getNumberAssignment_0(), "rule__ConditionRule__NumberAssignment_0");
			builder.put(grammarAccess.getConditionRuleAccess().getRangeAssignment_1(), "rule__ConditionRule__RangeAssignment_1");
			builder.put(grammarAccess.getConditionRuleAccess().getAliveAssignment_2(), "rule__ConditionRule__AliveAssignment_2");
			builder.put(grammarAccess.getConditionRulesAccess().getRule1Assignment_0(), "rule__ConditionRules__Rule1Assignment_0");
			builder.put(grammarAccess.getConditionRulesAccess().getOperatorAssignment_1_0(), "rule__ConditionRules__OperatorAssignment_1_0");
			builder.put(grammarAccess.getConditionRulesAccess().getRule2Assignment_1_1(), "rule__ConditionRules__Rule2Assignment_1_1");
			builder.put(grammarAccess.getRangeAccess().getBoundedAssignment_0(), "rule__Range__BoundedAssignment_0");
			builder.put(grammarAccess.getRangeAccess().getUnboundedAssignment_1(), "rule__Range__UnboundedAssignment_1");
			builder.put(grammarAccess.getBoundedRangeAccess().getLowerBoundAssignment_0(), "rule__BoundedRange__LowerBoundAssignment_0");
			builder.put(grammarAccess.getBoundedRangeAccess().getHigherBoundAssignment_2(), "rule__BoundedRange__HigherBoundAssignment_2");
			builder.put(grammarAccess.getUnboundedRangeAccess().getLeftAssignment_0(), "rule__UnboundedRange__LeftAssignment_0");
			builder.put(grammarAccess.getUnboundedRangeAccess().getRightAssignment_1(), "rule__UnboundedRange__RightAssignment_1");
			builder.put(grammarAccess.getGridAccess().getSizeAssignment_1(), "rule__Grid__SizeAssignment_1");
			builder.put(grammarAccess.getGridAccess().getPartsAssignment_2(), "rule__Grid__PartsAssignment_2");
			builder.put(grammarAccess.getOffsetAccess().getXAssignment_1(), "rule__Offset__XAssignment_1");
			builder.put(grammarAccess.getOffsetAccess().getYAssignment_2(), "rule__Offset__YAssignment_2");
			builder.put(grammarAccess.getSizeAccess().getWidthAssignment_1(), "rule__Size__WidthAssignment_1");
			builder.put(grammarAccess.getSizeAccess().getHeightAssignment_2(), "rule__Size__HeightAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GoLDSLGrammarAccess grammarAccess;

	@Override
	protected InternalGoLDSLParser createParser() {
		InternalGoLDSLParser result = new InternalGoLDSLParser(null);
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

	public GoLDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GoLDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
