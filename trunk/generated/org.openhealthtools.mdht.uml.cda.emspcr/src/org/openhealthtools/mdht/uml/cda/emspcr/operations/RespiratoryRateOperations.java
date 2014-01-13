/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignObservationOperations;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Respiratory Rate</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateRespiratoryRateMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateRespiratoryRateCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateRespiratoryRateEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateRespiratoryRateValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateVitalSignObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RespiratoryRateOperations extends VitalSignObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RespiratoryRateOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRespiratoryRateMoodCode(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRespiratoryRateMoodCode(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPIRATORY_RATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateRespiratoryRateMoodCode(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRespiratoryRateMoodCode(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESPIRATORY_RATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param respiratoryRate The receiving '<em><b>Respiratory Rate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRespiratoryRateMoodCode(RespiratoryRate respiratoryRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESPIRATORY_RATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPIRATORY_RATE);
			try {
				VALIDATE_RESPIRATORY_RATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPIRATORY_RATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPIRATORY_RATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(respiratoryRate)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPIRATORY_RATE__RESPIRATORY_RATE_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("RespiratoryRateMoodCode"),
						 new Object [] { respiratoryRate }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRespiratoryRateCode(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRespiratoryRateCode(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPIRATORY_RATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '9279-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateRespiratoryRateCode(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRespiratoryRateCode(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESPIRATORY_RATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param respiratoryRate The receiving '<em><b>Respiratory Rate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRespiratoryRateCode(RespiratoryRate respiratoryRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESPIRATORY_RATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPIRATORY_RATE);
			try {
				VALIDATE_RESPIRATORY_RATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPIRATORY_RATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPIRATORY_RATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(respiratoryRate)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPIRATORY_RATE__RESPIRATORY_RATE_CODE,
						 EmspcrPlugin.INSTANCE.getString("RespiratoryRateCode"),
						 new Object [] { respiratoryRate }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRespiratoryRateEffectiveTime(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRespiratoryRateEffectiveTime(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPIRATORY_RATE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateRespiratoryRateEffectiveTime(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRespiratoryRateEffectiveTime(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESPIRATORY_RATE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param respiratoryRate The receiving '<em><b>Respiratory Rate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRespiratoryRateEffectiveTime(RespiratoryRate respiratoryRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESPIRATORY_RATE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPIRATORY_RATE);
			try {
				VALIDATE_RESPIRATORY_RATE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPIRATORY_RATE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPIRATORY_RATE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(respiratoryRate)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPIRATORY_RATE__RESPIRATORY_RATE_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("RespiratoryRateEffectiveTime"),
						 new Object [] { respiratoryRate }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRespiratoryRateValue(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRespiratoryRateValue(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPIRATORY_RATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateRespiratoryRateValue(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRespiratoryRateValue(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESPIRATORY_RATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param respiratoryRate The receiving '<em><b>Respiratory Rate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateRespiratoryRateValue(RespiratoryRate respiratoryRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESPIRATORY_RATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPIRATORY_RATE);
			try {
				VALIDATE_RESPIRATORY_RATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPIRATORY_RATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPIRATORY_RATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(respiratoryRate)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPIRATORY_RATE__RESPIRATORY_RATE_VALUE,
						 EmspcrPlugin.INSTANCE.getString("RespiratoryRateValue"),
						 new Object [] { respiratoryRate }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignObservationTemplateId(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationTemplateId(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.146')";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignObservationTemplateId(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignObservationTemplateId(RespiratoryRate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_VITAL_SIGN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param respiratoryRate The receiving '<em><b>Respiratory Rate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVitalSignObservationTemplateId(RespiratoryRate respiratoryRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VITAL_SIGN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPIRATORY_RATE);
			try {
				VALIDATE_VITAL_SIGN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(respiratoryRate)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPIRATORY_RATE__VITAL_SIGN_OBSERVATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("VitalSignObservationTemplateId"),
						 new Object [] { respiratoryRate }));
			}
			 
			return false;
		}
		return true;
	}

} // RespiratoryRateOperations