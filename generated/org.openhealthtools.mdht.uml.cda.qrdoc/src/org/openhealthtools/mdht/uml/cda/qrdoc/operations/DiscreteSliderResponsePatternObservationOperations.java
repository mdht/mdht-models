/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.qrdoc.DiscreteSliderResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.util.QRDOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discrete Slider Response Pattern Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.DiscreteSliderResponsePatternObservation#validateMultipleChoiceResponsePatternObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteSliderResponsePatternObservationOperations extends
		MultipleChoiceResponsePatternObservationOperations {
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
	protected DiscreteSliderResponsePatternObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMultipleChoiceResponsePatternObservationTemplateId(DiscreteSliderResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationTemplateId(DiscreteSliderResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.33.4.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateMultipleChoiceResponsePatternObservationTemplateId(DiscreteSliderResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiple Choice Response Pattern Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMultipleChoiceResponsePatternObservationTemplateId(DiscreteSliderResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param discreteSliderResponsePatternObservation The receiving '<em><b>Discrete Slider Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMultipleChoiceResponsePatternObservationTemplateId(
			DiscreteSliderResponsePatternObservation discreteSliderResponsePatternObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION);
			try {
				VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(discreteSliderResponsePatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION__MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DiscreteSliderResponsePatternObservationMultipleChoiceResponsePatternObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(discreteSliderResponsePatternObservation, context) }),
						 new Object [] { discreteSliderResponsePatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // DiscreteSliderResponsePatternObservationOperations
