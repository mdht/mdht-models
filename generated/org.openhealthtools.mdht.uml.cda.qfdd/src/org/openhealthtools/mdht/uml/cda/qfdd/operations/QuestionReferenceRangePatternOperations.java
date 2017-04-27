/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ReferenceRangeOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionReferenceRangePattern;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Question Reference Range Pattern</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionReferenceRangePattern#validateQuestionReferenceRangePatternTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionReferenceRangePattern#validateQuestionReferenceRangePatternTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionReferenceRangePattern#validateQuestionReferenceRangePatternObservationRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Observation Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionReferenceRangePattern#validateQuestionReferenceRangePatternObservationRangeIVLINTHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Observation Range IVLINT High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionReferenceRangePattern#validateQuestionReferenceRangePatternObservationRangeIVLINTLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Observation Range IVLINT Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionReferenceRangePattern#validateQuestionReferenceRangePatternObservationRangeText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Observation Range Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionReferenceRangePattern#validateQuestionReferenceRangePatternObservationRangeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Observation Range Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionReferenceRangePatternOperations extends ReferenceRangeOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionReferenceRangePatternOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionReferenceRangePatternTemplateId(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionReferenceRangePatternTemplateId(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32.4.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionReferenceRangePatternTemplateId(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionReferenceRangePatternTemplateId(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionReferenceRangePattern The receiving '<em><b>Question Reference Range Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionReferenceRangePatternTemplateId(
			QuestionReferenceRangePattern questionReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_REFERENCE_RANGE_PATTERN);
			try {
				VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionReferenceRangePattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_REFERENCE_RANGE_PATTERN__QUESTION_REFERENCE_RANGE_PATTERN_TEMPLATE_ID,
						 QFDDPlugin.INSTANCE.getString("QuestionReferenceRangePatternQuestionReferenceRangePatternTemplateId"),
						 new Object [] { questionReferenceRangePattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionReferenceRangePatternTypeCode(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionReferenceRangePatternTypeCode(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('typeCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionReferenceRangePatternTypeCode(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionReferenceRangePatternTypeCode(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionReferenceRangePattern The receiving '<em><b>Question Reference Range Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionReferenceRangePatternTypeCode(
			QuestionReferenceRangePattern questionReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_REFERENCE_RANGE_PATTERN);
			try {
				VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionReferenceRangePattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_REFERENCE_RANGE_PATTERN__QUESTION_REFERENCE_RANGE_PATTERN_TYPE_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionReferenceRangePatternQuestionReferenceRangePatternTypeCode"),
						 new Object [] { questionReferenceRangePattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionReferenceRangePatternObservationRange(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Observation Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionReferenceRangePatternObservationRange(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.observationRange->one(observationRange : cda::ObservationRange | not observationRange.oclIsUndefined() and observationRange.oclIsKindOf(cda::ObservationRange))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionReferenceRangePatternObservationRange(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Observation Range</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionReferenceRangePatternObservationRange(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionReferenceRangePattern The receiving '<em><b>Question Reference Range Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionReferenceRangePatternObservationRange(
			QuestionReferenceRangePattern questionReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_REFERENCE_RANGE_PATTERN);
			try {
				VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionReferenceRangePattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_REFERENCE_RANGE_PATTERN__QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE,
						 QFDDPlugin.INSTANCE.getString("QuestionReferenceRangePatternQuestionReferenceRangePatternObservationRange"),
						 new Object [] { questionReferenceRangePattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionReferenceRangePatternObservationRangeIVLINTHigh(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Observation Range IVLINT High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionReferenceRangePatternObservationRangeIVLINTHigh(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated not
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.observationRange->excluding(null).value->excluding(null)->select(isNullFlavorUndefined()).oclAsType(datatypes::IVL_INT)->reject(int : datatypes::IVL_INT | ( int.isNullFlavorUndefined() implies ((int.high.oclIsUndefined() or int.high.isNullFlavorUndefined()) implies (not int.high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionReferenceRangePatternObservationRangeIVLINTHigh(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Observation Range IVLINT High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionReferenceRangePatternObservationRangeIVLINTHigh(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionReferenceRangePattern The receiving '<em><b>Question Reference Range Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionReferenceRangePatternObservationRangeIVLINTHigh(
			QuestionReferenceRangePattern questionReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_REFERENCE_RANGE_PATTERN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionReferenceRangePattern);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_REFERENCE_RANGE_PATTERN__QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH,
						 QFDDPlugin.INSTANCE.getString("QuestionReferenceRangePatternQuestionReferenceRangePatternObservationRangeIVLINTHigh"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionReferenceRangePatternObservationRangeIVLINTLow(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Observation Range IVLINT Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionReferenceRangePatternObservationRangeIVLINTLow(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated not
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.observationRange->excluding(null).value->excluding(null)->select(isNullFlavorUndefined()).oclAsType(datatypes::IVL_INT)->reject( int : datatypes::IVL_INT | ( int.isNullFlavorUndefined() implies ((int.low.oclIsUndefined() or int.low.isNullFlavorUndefined()) implies (not int.low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionReferenceRangePatternObservationRangeIVLINTLow(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Observation Range IVLINT Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionReferenceRangePatternObservationRangeIVLINTLow(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionReferenceRangePattern The receiving '<em><b>Question Reference Range Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionReferenceRangePatternObservationRangeIVLINTLow(
			QuestionReferenceRangePattern questionReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_REFERENCE_RANGE_PATTERN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionReferenceRangePattern);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_REFERENCE_RANGE_PATTERN__QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW,
						 QFDDPlugin.INSTANCE.getString("QuestionReferenceRangePatternQuestionReferenceRangePatternObservationRangeIVLINTLow"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionReferenceRangePatternObservationRangeText(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Observation Range Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionReferenceRangePatternObservationRangeText(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.observationRange->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionReferenceRangePatternObservationRangeText(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Observation Range Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionReferenceRangePatternObservationRangeText(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionReferenceRangePattern The receiving '<em><b>Question Reference Range Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionReferenceRangePatternObservationRangeText(
			QuestionReferenceRangePattern questionReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_REFERENCE_RANGE_PATTERN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionReferenceRangePattern);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_REFERENCE_RANGE_PATTERN__QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT,
						 QFDDPlugin.INSTANCE.getString("QuestionReferenceRangePatternQuestionReferenceRangePatternObservationRangeText"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionReferenceRangePatternObservationRangeValue(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Observation Range Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionReferenceRangePatternObservationRangeValue(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.observationRange->excluding(null)->reject((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined() and value.oclIsTypeOf(datatypes::IVL_INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionReferenceRangePatternObservationRangeValue(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Question Reference Range Pattern Observation Range Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionReferenceRangePatternObservationRangeValue(QuestionReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionReferenceRangePattern The receiving '<em><b>Question Reference Range Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionReferenceRangePatternObservationRangeValue(
			QuestionReferenceRangePattern questionReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTION_REFERENCE_RANGE_PATTERN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionReferenceRangePattern);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTION_REFERENCE_RANGE_PATTERN__QUESTION_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE,
						 QFDDPlugin.INSTANCE.getString("QuestionReferenceRangePatternQuestionReferenceRangePatternObservationRangeValue"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // QuestionReferenceRangePatternOperations
