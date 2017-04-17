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
import org.openhealthtools.mdht.uml.cda.qrdoc.AnalogSliderResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.util.QRDOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Analog Slider Response Pattern Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.AnalogSliderResponsePatternObservation#validateNumericResponsePatternObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Response Pattern Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalogSliderResponsePatternObservationOperations extends NumericResponsePatternObservationOperations {
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
	protected AnalogSliderResponsePatternObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumericResponsePatternObservationTemplateId(AnalogSliderResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Response Pattern Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericResponsePatternObservationTemplateId(AnalogSliderResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMERIC_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.33.4.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumericResponsePatternObservationTemplateId(AnalogSliderResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Response Pattern Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumericResponsePatternObservationTemplateId(AnalogSliderResponsePatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NUMERIC_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param analogSliderResponsePatternObservation The receiving '<em><b>Analog Slider Response Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumericResponsePatternObservationTemplateId(
			AnalogSliderResponsePatternObservation analogSliderResponsePatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NUMERIC_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION);
			try {
				VALIDATE_NUMERIC_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NUMERIC_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NUMERIC_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(analogSliderResponsePatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION__NUMERIC_RESPONSE_PATTERN_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AnalogSliderResponsePatternObservationNumericResponsePatternObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(analogSliderResponsePatternObservation, context) }),
						 new Object [] { analogSliderResponsePatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // AnalogSliderResponsePatternObservationOperations
