/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Airway Confirmation Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Method Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AirwayConfirmationObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirwayConfirmationObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAirwayConfirmationObservationTemplateId(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationTemplateId(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.175')";

	/**
	 * The cached OCL invariant for the '{@link #validateAirwayConfirmationObservationTemplateId(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationTemplateId(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param airwayConfirmationObservation The receiving '<em><b>Airway Confirmation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAirwayConfirmationObservationTemplateId(AirwayConfirmationObservation airwayConfirmationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.AIRWAY_CONFIRMATION_OBSERVATION);
			try {
				VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(airwayConfirmationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.AIRWAY_CONFIRMATION_OBSERVATION__AIRWAY_CONFIRMATION_OBSERVATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("AirwayConfirmationObservationTemplateId"),
						 new Object [] { airwayConfirmationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAirwayConfirmationObservationMoodCode(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationMoodCode(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAirwayConfirmationObservationMoodCode(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationMoodCode(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param airwayConfirmationObservation The receiving '<em><b>Airway Confirmation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAirwayConfirmationObservationMoodCode(AirwayConfirmationObservation airwayConfirmationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.AIRWAY_CONFIRMATION_OBSERVATION);
			try {
				VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(airwayConfirmationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.AIRWAY_CONFIRMATION_OBSERVATION__AIRWAY_CONFIRMATION_OBSERVATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("AirwayConfirmationObservationMoodCode"),
						 new Object [] { airwayConfirmationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAirwayConfirmationObservationCodeP(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationCodeP(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAirwayConfirmationObservationCodeP(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationCodeP(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param airwayConfirmationObservation The receiving '<em><b>Airway Confirmation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAirwayConfirmationObservationCodeP(AirwayConfirmationObservation airwayConfirmationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.AIRWAY_CONFIRMATION_OBSERVATION);
			try {
				VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(airwayConfirmationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.AIRWAY_CONFIRMATION_OBSERVATION__AIRWAY_CONFIRMATION_OBSERVATION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("AirwayConfirmationObservationCodeP"),
						 new Object [] { airwayConfirmationObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservationCodeP", passToken);
				}
				passToken.add(airwayConfirmationObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAirwayConfirmationObservationCode(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationCode(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '71576-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAirwayConfirmationObservationCode(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationCode(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param airwayConfirmationObservation The receiving '<em><b>Airway Confirmation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAirwayConfirmationObservationCode(AirwayConfirmationObservation airwayConfirmationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(airwayConfirmationObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.AIRWAY_CONFIRMATION_OBSERVATION);
			try {
				VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(airwayConfirmationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.AIRWAY_CONFIRMATION_OBSERVATION__AIRWAY_CONFIRMATION_OBSERVATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("AirwayConfirmationObservationCode"),
						 new Object [] { airwayConfirmationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAirwayConfirmationObservationEffectiveTime(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationEffectiveTime(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAirwayConfirmationObservationEffectiveTime(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationEffectiveTime(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param airwayConfirmationObservation The receiving '<em><b>Airway Confirmation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAirwayConfirmationObservationEffectiveTime(AirwayConfirmationObservation airwayConfirmationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.AIRWAY_CONFIRMATION_OBSERVATION);
			try {
				VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(airwayConfirmationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.AIRWAY_CONFIRMATION_OBSERVATION__AIRWAY_CONFIRMATION_OBSERVATION_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("AirwayConfirmationObservationEffectiveTime"),
						 new Object [] { airwayConfirmationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAirwayConfirmationObservationValue(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationValue(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAirwayConfirmationObservationValue(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationValue(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param airwayConfirmationObservation The receiving '<em><b>Airway Confirmation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAirwayConfirmationObservationValue(AirwayConfirmationObservation airwayConfirmationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.AIRWAY_CONFIRMATION_OBSERVATION);
			try {
				VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(airwayConfirmationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.AIRWAY_CONFIRMATION_OBSERVATION__AIRWAY_CONFIRMATION_OBSERVATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("AirwayConfirmationObservationValue"),
						 new Object [] { airwayConfirmationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAirwayConfirmationObservationMethodCode(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationMethodCode(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->size() = 1 and self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA18672-8' or value.code = 'LA18673-6' or value.code = 'LA18674-4' or value.code = 'LA18675-1' or value.code = 'LA18676-9' or value.code = 'LA18677-7' or value.code = 'LA18678-5' or value.code = 'LA18679-3' or value.code = 'LA18680-1' or value.code = 'LA18681-9')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAirwayConfirmationObservationMethodCode(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationMethodCode(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param airwayConfirmationObservation The receiving '<em><b>Airway Confirmation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAirwayConfirmationObservationMethodCode(AirwayConfirmationObservation airwayConfirmationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.AIRWAY_CONFIRMATION_OBSERVATION);
			try {
				VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(airwayConfirmationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.AIRWAY_CONFIRMATION_OBSERVATION__AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("AirwayConfirmationObservationMethodCode"),
						 new Object [] { airwayConfirmationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAirwayConfirmationObservationMethodCodeP(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Method Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationMethodCodeP(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateAirwayConfirmationObservationMethodCodeP(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Method Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirwayConfirmationObservationMethodCodeP(AirwayConfirmationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param airwayConfirmationObservation The receiving '<em><b>Airway Confirmation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAirwayConfirmationObservationMethodCodeP(AirwayConfirmationObservation airwayConfirmationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.AIRWAY_CONFIRMATION_OBSERVATION);
			try {
				VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(airwayConfirmationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.AIRWAY_CONFIRMATION_OBSERVATION__AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("AirwayConfirmationObservationMethodCodeP"),
						 new Object [] { airwayConfirmationObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // AirwayConfirmationObservationOperations