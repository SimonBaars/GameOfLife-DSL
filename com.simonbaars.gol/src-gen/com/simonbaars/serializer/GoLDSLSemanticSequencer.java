/*
 * generated by Xtext 2.19.0
 */
package com.simonbaars.serializer;

import com.google.inject.Inject;
import com.simonbaars.goLDSL.Board;
import com.simonbaars.goLDSL.BoundedRange;
import com.simonbaars.goLDSL.Cell;
import com.simonbaars.goLDSL.CellPairs;
import com.simonbaars.goLDSL.Condition;
import com.simonbaars.goLDSL.ConditionRule;
import com.simonbaars.goLDSL.ConditionRules;
import com.simonbaars.goLDSL.DSL;
import com.simonbaars.goLDSL.GoLDSLPackage;
import com.simonbaars.goLDSL.Grid;
import com.simonbaars.goLDSL.GridOffset;
import com.simonbaars.goLDSL.LeftUnboundedRange;
import com.simonbaars.goLDSL.Lives;
import com.simonbaars.goLDSL.Objects;
import com.simonbaars.goLDSL.RightUnboundedRange;
import com.simonbaars.goLDSL.Rule;
import com.simonbaars.goLDSL.ShapeDef;
import com.simonbaars.goLDSL.ShapeRef;
import com.simonbaars.goLDSL.Size;
import com.simonbaars.services.GoLDSLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GoLDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GoLDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GoLDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GoLDSLPackage.ACTION:
				sequence_Action(context, (com.simonbaars.goLDSL.Action) semanticObject); 
				return; 
			case GoLDSLPackage.BOARD:
				sequence_Board(context, (Board) semanticObject); 
				return; 
			case GoLDSLPackage.BOUNDED_RANGE:
				sequence_BoundedRange(context, (BoundedRange) semanticObject); 
				return; 
			case GoLDSLPackage.CELL:
				sequence_Cell(context, (Cell) semanticObject); 
				return; 
			case GoLDSLPackage.CELL_PAIRS:
				sequence_CellPairs(context, (CellPairs) semanticObject); 
				return; 
			case GoLDSLPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case GoLDSLPackage.CONDITION_RULE:
				sequence_ConditionRule(context, (ConditionRule) semanticObject); 
				return; 
			case GoLDSLPackage.CONDITION_RULES:
				sequence_ConditionRules(context, (ConditionRules) semanticObject); 
				return; 
			case GoLDSLPackage.DSL:
				sequence_DSL(context, (DSL) semanticObject); 
				return; 
			case GoLDSLPackage.GRID:
				sequence_Grid(context, (Grid) semanticObject); 
				return; 
			case GoLDSLPackage.GRID_OFFSET:
				sequence_GridOffset(context, (GridOffset) semanticObject); 
				return; 
			case GoLDSLPackage.LEFT_UNBOUNDED_RANGE:
				sequence_LeftUnboundedRange(context, (LeftUnboundedRange) semanticObject); 
				return; 
			case GoLDSLPackage.LIVES:
				sequence_Lives(context, (Lives) semanticObject); 
				return; 
			case GoLDSLPackage.OBJECTS:
				sequence_Objects(context, (Objects) semanticObject); 
				return; 
			case GoLDSLPackage.RIGHT_UNBOUNDED_RANGE:
				sequence_RightUnboundedRange(context, (RightUnboundedRange) semanticObject); 
				return; 
			case GoLDSLPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case GoLDSLPackage.SHAPE_DEF:
				sequence_ShapeDef(context, (ShapeDef) semanticObject); 
				return; 
			case GoLDSLPackage.SHAPE_REF:
				sequence_ShapeRef(context, (ShapeRef) semanticObject); 
				return; 
			case GoLDSLPackage.SIZE:
				sequence_Size(context, (Size) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     objects=Objects
	 */
	protected void sequence_Action(ISerializationContext context, com.simonbaars.goLDSL.Action semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.ACTION__OBJECTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.ACTION__OBJECTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActionAccess().getObjectsObjectsParserRuleCall_1_0(), semanticObject.getObjects());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Board returns Board
	 *
	 * Constraint:
	 *     objects=Objects
	 */
	protected void sequence_Board(ISerializationContext context, Board semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.BOARD__OBJECTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.BOARD__OBJECTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBoardAccess().getObjectsObjectsParserRuleCall_1_0(), semanticObject.getObjects());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Range returns BoundedRange
	 *     BoundedRange returns BoundedRange
	 *
	 * Constraint:
	 *     (lowerBound=INT higherBound=INT)
	 */
	protected void sequence_BoundedRange(ISerializationContext context, BoundedRange semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.BOUNDED_RANGE__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.BOUNDED_RANGE__LOWER_BOUND));
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.BOUNDED_RANGE__HIGHER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.BOUNDED_RANGE__HIGHER_BOUND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBoundedRangeAccess().getLowerBoundINTTerminalRuleCall_0_0(), semanticObject.getLowerBound());
		feeder.accept(grammarAccess.getBoundedRangeAccess().getHigherBoundINTTerminalRuleCall_2_0(), semanticObject.getHigherBound());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CellPairs returns CellPairs
	 *     Cells returns CellPairs
	 *
	 * Constraint:
	 *     cells+=Cell+
	 */
	protected void sequence_CellPairs(ISerializationContext context, CellPairs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CellDef returns Cell
	 *     Cell returns Cell
	 *
	 * Constraint:
	 *     (x=INT y=INT)
	 */
	protected void sequence_Cell(ISerializationContext context, Cell semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.CELL__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.CELL__X));
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.CELL__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.CELL__Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCellAccess().getXINTTerminalRuleCall_0_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getCellAccess().getYINTTerminalRuleCall_2_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConditionRule returns ConditionRule
	 *
	 * Constraint:
	 *     (number=INT | range=Range | lives=Lives)
	 */
	protected void sequence_ConditionRule(ISerializationContext context, ConditionRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConditionRules returns ConditionRules
	 *
	 * Constraint:
	 *     (rule1=ConditionRule (operator=BoolOperator rules2=ConditionRules)?)
	 */
	protected void sequence_ConditionRules(ISerializationContext context, ConditionRules semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     conditions=ConditionRules
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.CONDITION__CONDITIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.CONDITION__CONDITIONS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getConditionsConditionRulesParserRuleCall_1_0(), semanticObject.getConditions());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DSL returns DSL
	 *
	 * Constraint:
	 *     (board=Board (rules+=Rule | shapes+=ShapeDef)*)
	 */
	protected void sequence_DSL(ISerializationContext context, DSL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GridOffset returns GridOffset
	 *
	 * Constraint:
	 *     offset=INT
	 */
	protected void sequence_GridOffset(ISerializationContext context, GridOffset semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.GRID_OFFSET__OFFSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.GRID_OFFSET__OFFSET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGridOffsetAccess().getOffsetINTTerminalRuleCall_1_0(), semanticObject.getOffset());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Grid returns Grid
	 *
	 * Constraint:
	 *     (size=Size? parts+=GridPart+)
	 */
	protected void sequence_Grid(ISerializationContext context, Grid semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Range returns LeftUnboundedRange
	 *     UnboundedRange returns LeftUnboundedRange
	 *     LeftUnboundedRange returns LeftUnboundedRange
	 *
	 * Constraint:
	 *     lowerBound=INT
	 */
	protected void sequence_LeftUnboundedRange(ISerializationContext context, LeftUnboundedRange semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.LEFT_UNBOUNDED_RANGE__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.LEFT_UNBOUNDED_RANGE__LOWER_BOUND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLeftUnboundedRangeAccess().getLowerBoundINTTerminalRuleCall_1_0(), semanticObject.getLowerBound());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Lives returns Lives
	 *
	 * Constraint:
	 *     cell=CellPairs
	 */
	protected void sequence_Lives(ISerializationContext context, Lives semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.LIVES__CELL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.LIVES__CELL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLivesAccess().getCellCellPairsParserRuleCall_1_0(), semanticObject.getCell());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Objects returns Objects
	 *
	 * Constraint:
	 *     (shapes+=ShapeRef | cell+=CellDef | cells+=Cells | grids+=Grid)+
	 */
	protected void sequence_Objects(ISerializationContext context, Objects semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Range returns RightUnboundedRange
	 *     UnboundedRange returns RightUnboundedRange
	 *     RightUnboundedRange returns RightUnboundedRange
	 *
	 * Constraint:
	 *     higherBound=INT
	 */
	protected void sequence_RightUnboundedRange(ISerializationContext context, RightUnboundedRange semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.RIGHT_UNBOUNDED_RANGE__HIGHER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.RIGHT_UNBOUNDED_RANGE__HIGHER_BOUND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRightUnboundedRangeAccess().getHigherBoundINTTerminalRuleCall_1_0(), semanticObject.getHigherBound());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (condition=Condition action=Action)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.RULE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.RULE__CONDITION));
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.RULE__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.RULE__ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getRuleAccess().getActionActionParserRuleCall_2_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ShapeDef returns ShapeDef
	 *
	 * Constraint:
	 *     (name=ID offset=GridOffset? objects=Objects)
	 */
	protected void sequence_ShapeDef(ISerializationContext context, ShapeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ShapeRef returns ShapeRef
	 *
	 * Constraint:
	 *     (name=ID x=INT y=INT)
	 */
	protected void sequence_ShapeRef(ISerializationContext context, ShapeRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.SHAPE_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.SHAPE_REF__NAME));
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.SHAPE_REF__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.SHAPE_REF__X));
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.SHAPE_REF__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.SHAPE_REF__Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShapeRefAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getShapeRefAccess().getXINTTerminalRuleCall_3_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getShapeRefAccess().getYINTTerminalRuleCall_5_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Size returns Size
	 *
	 * Constraint:
	 *     (width=INT height=INT)
	 */
	protected void sequence_Size(ISerializationContext context, Size semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.SIZE__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.SIZE__WIDTH));
			if (transientValues.isValueTransient(semanticObject, GoLDSLPackage.Literals.SIZE__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoLDSLPackage.Literals.SIZE__HEIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_1_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_2_0(), semanticObject.getHeight());
		feeder.finish();
	}
	
	
}
