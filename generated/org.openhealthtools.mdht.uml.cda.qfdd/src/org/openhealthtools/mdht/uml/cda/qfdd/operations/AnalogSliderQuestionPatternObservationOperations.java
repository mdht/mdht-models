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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.qfdd.AnalogSliderQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Analog Slider Question Pattern Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.AnalogSliderQuestionPatternObservation#validateAnalogSliderQuestionPatternObservationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Analog Slider Question Pattern Observation Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.AnalogSliderQuestionPatternObservation#validateAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Analog Slider Question Pattern Observation Reference Range Observation Range Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.AnalogSliderQuestionPatternObservation#validateAnalogSliderQuestionPatternObservationReferenceRangeTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Analog Slider Question Pattern Observation Reference Range Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.AnalogSliderQuestionPatternObservation#validateNumericQuestionPatternObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalogSliderQuestionPatternObservationOperations extends NumericQuestionPatternObservationOperations {
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
	protected AnalogSliderQuestionPatternObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnalogSliderQuestionPatternObservationReferenceRange(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Analog Slider Question Pattern Observation Reference Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnalogSliderQuestionPatternObservationReferenceRange(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->exists(referenceRange : cda::ReferenceRange | not referenceRange.oclIsUndefined() and referenceRange.oclIsKindOf(cda::ReferenceRange))";

	/**
	 * The cached OCL invariant for the '{@link #validateAnalogSliderQuestionPatternObservationReferenceRange(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Analog Slider Question Pattern Observation Reference Range</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnalogSliderQuestionPatternObservationReferenceRange(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param analogSliderQuestionPatternObservation The receiving '<em><b>Analog Slider Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAnalogSliderQuestionPatternObservationReferenceRange(
			AnalogSliderQuestionPatternObservation analogSliderQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(analogSliderQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE,
						 QFDDPlugin.INSTANCE.getString("AnalogSliderQuestionPatternObservationAnalogSliderQuestionPatternObservationReferenceRange"),
						 new Object [] { analogSliderQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Analog Slider Question Pattern Observation Reference Range Observation Range Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Analog Slider Question Pattern Observation Reference Range Observation Range Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param analogSliderQuestionPatternObservation The receiving '<em><b>Analog Slider Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue(
			AnalogSliderQuestionPatternObservation analogSliderQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(analogSliderQuestionPatternObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_VALUE,
						 QFDDPlugin.INSTANCE.getString("AnalogSliderQuestionPatternObservationAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnalogSliderQuestionPatternObservationReferenceRangeTypeCode(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Analog Slider Question Pattern Observation Reference Range Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnalogSliderQuestionPatternObservationReferenceRangeTypeCode(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null)->reject(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAnalogSliderQuestionPatternObservationReferenceRangeTypeCode(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Analog Slider Question Pattern Observation Reference Range Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnalogSliderQuestionPatternObservationReferenceRangeTypeCode(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param analogSliderQuestionPatternObservation The receiving '<em><b>Analog Slider Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAnalogSliderQuestionPatternObservationReferenceRangeTypeCode(
			AnalogSliderQuestionPatternObservation analogSliderQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(analogSliderQuestionPatternObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION_REFERENCE_RANGE_TYPE_CODE,
						 QFDDPlugin.INSTANCE.getString("AnalogSliderQuestionPatternObservationAnalogSliderQuestionPatternObservationReferenceRangeTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumericQuestionPatternObservationTemplateId(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationTemplateId(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32.4.10')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumericQuestionPatternObservationTemplateId(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Question Pattern Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericQuestionPatternObservationTemplateId(AnalogSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param analogSliderQuestionPatternObservation The receiving '<em><b>Analog Slider Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumericQuestionPatternObservationTemplateId(
			AnalogSliderQuestionPatternObservation analogSliderQuestionPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(analogSliderQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION__NUMERIC_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AnalogSliderQuestionPatternObservationNumericQuestionPatternObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(analogSliderQuestionPatternObservation, context) }),
						 new Object [] { analogSliderQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // AnalogSliderQuestionPatternObservationOperations
