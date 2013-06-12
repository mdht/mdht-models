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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Incident Disposition Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation#validateIncidentDispositionObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation#validateIncidentDispositionObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation#validateIncidentDispositionObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation#validateIncidentDispositionObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation#validateIncidentDispositionObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation#validateIncidentDispositionObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncidentDispositionObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncidentDispositionObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIncidentDispositionObservationTemplateId(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIncidentDispositionObservationTemplateId(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.32')";

	/**
	 * The cached OCL invariant for the '{@link #validateIncidentDispositionObservationTemplateId(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIncidentDispositionObservationTemplateId(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param incidentDispositionObservation The receiving '<em><b>Incident Disposition Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateIncidentDispositionObservationTemplateId(IncidentDispositionObservation incidentDispositionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INCIDENT_DISPOSITION_OBSERVATION);
			try {
				VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(incidentDispositionObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INCIDENT_DISPOSITION_OBSERVATION__INCIDENT_DISPOSITION_OBSERVATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("IncidentDispositionObservationTemplateId"),
						 new Object [] { incidentDispositionObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIncidentDispositionObservationCodeP(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIncidentDispositionObservationCodeP(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateIncidentDispositionObservationCodeP(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIncidentDispositionObservationCodeP(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param incidentDispositionObservation The receiving '<em><b>Incident Disposition Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateIncidentDispositionObservationCodeP(IncidentDispositionObservation incidentDispositionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INCIDENT_DISPOSITION_OBSERVATION);
			try {
				VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(incidentDispositionObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INCIDENT_DISPOSITION_OBSERVATION__INCIDENT_DISPOSITION_OBSERVATION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("IncidentDispositionObservationCodeP"),
						 new Object [] { incidentDispositionObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservationCodeP", passToken);
				}
				passToken.add(incidentDispositionObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIncidentDispositionObservationCode(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIncidentDispositionObservationCode(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67548-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateIncidentDispositionObservationCode(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIncidentDispositionObservationCode(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param incidentDispositionObservation The receiving '<em><b>Incident Disposition Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateIncidentDispositionObservationCode(IncidentDispositionObservation incidentDispositionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(incidentDispositionObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INCIDENT_DISPOSITION_OBSERVATION);
			try {
				VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(incidentDispositionObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INCIDENT_DISPOSITION_OBSERVATION__INCIDENT_DISPOSITION_OBSERVATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("IncidentDispositionObservationCode"),
						 new Object [] { incidentDispositionObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIncidentDispositionObservationValue(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIncidentDispositionObservationValue(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17154-8' or value.code = 'LA17155-5' or value.code = 'LA17156-3' or value.code = 'LA17157-1' or value.code = 'LA17158-9' or value.code = 'LA17159-7' or value.code = 'LA17160-5' or value.code = 'LA17161-3' or value.code = 'LA17162-1' or value.code = 'LA17163-9' or value.code = 'LA17164-7' or value.code = 'LA17165-4' or value.code = 'LA17166-2' or value.code = 'LA17167-0' or value.code = 'LA18080-4' or value.code = 'LA18212-3' or value.code = 'LA18213-1' or value.code = 'LA18214-9' or value.code = 'LA18215-6' or value.code = 'LA18216-4')))";

	/**
	 * The cached OCL invariant for the '{@link #validateIncidentDispositionObservationValue(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIncidentDispositionObservationValue(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param incidentDispositionObservation The receiving '<em><b>Incident Disposition Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateIncidentDispositionObservationValue(IncidentDispositionObservation incidentDispositionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INCIDENT_DISPOSITION_OBSERVATION);
			try {
				VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(incidentDispositionObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INCIDENT_DISPOSITION_OBSERVATION__INCIDENT_DISPOSITION_OBSERVATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("IncidentDispositionObservationValue"),
						 new Object [] { incidentDispositionObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIncidentDispositionObservationValueP(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIncidentDispositionObservationValueP(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateIncidentDispositionObservationValueP(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIncidentDispositionObservationValueP(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param incidentDispositionObservation The receiving '<em><b>Incident Disposition Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateIncidentDispositionObservationValueP(IncidentDispositionObservation incidentDispositionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INCIDENT_DISPOSITION_OBSERVATION);
			try {
				VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(incidentDispositionObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INCIDENT_DISPOSITION_OBSERVATION__INCIDENT_DISPOSITION_OBSERVATION_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("IncidentDispositionObservationValueP"),
						 new Object [] { incidentDispositionObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIncidentDispositionObservationMoodCode(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIncidentDispositionObservationMoodCode(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateIncidentDispositionObservationMoodCode(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIncidentDispositionObservationMoodCode(IncidentDispositionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param incidentDispositionObservation The receiving '<em><b>Incident Disposition Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateIncidentDispositionObservationMoodCode(IncidentDispositionObservation incidentDispositionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INCIDENT_DISPOSITION_OBSERVATION);
			try {
				VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(incidentDispositionObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INCIDENT_DISPOSITION_OBSERVATION__INCIDENT_DISPOSITION_OBSERVATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("IncidentDispositionObservationMoodCode"),
						 new Object [] { incidentDispositionObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // IncidentDispositionObservationOperations