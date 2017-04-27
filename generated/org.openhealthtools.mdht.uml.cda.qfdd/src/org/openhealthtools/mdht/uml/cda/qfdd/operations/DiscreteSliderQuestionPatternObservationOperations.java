/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.qfdd.DiscreteSliderQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discrete Slider Question Pattern Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.DiscreteSliderQuestionPatternObservation#validateMultipleChoiceQuestionPatternObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteSliderQuestionPatternObservationOperations extends
		MultipleChoiceQuestionPatternObservationOperations {
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
	protected DiscreteSliderQuestionPatternObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceQuestionPatternObservationTemplateId(DiscreteSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationTemplateId(DiscreteSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32.4.11')";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceQuestionPatternObservationTemplateId(DiscreteSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Question Pattern Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceQuestionPatternObservationTemplateId(DiscreteSliderQuestionPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param discreteSliderQuestionPatternObservation The receiving '<em><b>Discrete Slider Question Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceQuestionPatternObservationTemplateId(
			DiscreteSliderQuestionPatternObservation discreteSliderQuestionPatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(discreteSliderQuestionPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION__MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DiscreteSliderQuestionPatternObservationMultipleChoiceQuestionPatternObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(discreteSliderQuestionPatternObservation, context) }),
						 new Object [] { discreteSliderQuestionPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // DiscreteSliderQuestionPatternObservationOperations
