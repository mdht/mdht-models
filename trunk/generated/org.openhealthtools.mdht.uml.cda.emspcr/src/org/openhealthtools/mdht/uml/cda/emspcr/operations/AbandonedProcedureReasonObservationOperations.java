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

import org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Abandoned Procedure Reason Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation#validateAbandonedProcedureReasonObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation#validateAbandonedProcedureReasonObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation#validateAbandonedProcedureReasonObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation#validateAbandonedProcedureReasonObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation#validateAbandonedProcedureReasonObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation#validateAbandonedProcedureReasonObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbandonedProcedureReasonObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbandonedProcedureReasonObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbandonedProcedureReasonObservationTemplateId(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbandonedProcedureReasonObservationTemplateId(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.130')";

	/**
	 * The cached OCL invariant for the '{@link #validateAbandonedProcedureReasonObservationTemplateId(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbandonedProcedureReasonObservationTemplateId(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abandonedProcedureReasonObservation The receiving '<em><b>Abandoned Procedure Reason Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAbandonedProcedureReasonObservationTemplateId(AbandonedProcedureReasonObservation abandonedProcedureReasonObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ABANDONED_PROCEDURE_REASON_OBSERVATION);
			try {
				VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(abandonedProcedureReasonObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ABANDONED_PROCEDURE_REASON_OBSERVATION__ABANDONED_PROCEDURE_REASON_OBSERVATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("AbandonedProcedureReasonObservationTemplateId"),
						 new Object [] { abandonedProcedureReasonObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbandonedProcedureReasonObservationMoodCode(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbandonedProcedureReasonObservationMoodCode(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAbandonedProcedureReasonObservationMoodCode(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbandonedProcedureReasonObservationMoodCode(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abandonedProcedureReasonObservation The receiving '<em><b>Abandoned Procedure Reason Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAbandonedProcedureReasonObservationMoodCode(AbandonedProcedureReasonObservation abandonedProcedureReasonObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ABANDONED_PROCEDURE_REASON_OBSERVATION);
			try {
				VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(abandonedProcedureReasonObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ABANDONED_PROCEDURE_REASON_OBSERVATION__ABANDONED_PROCEDURE_REASON_OBSERVATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("AbandonedProcedureReasonObservationMoodCode"),
						 new Object [] { abandonedProcedureReasonObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbandonedProcedureReasonObservationCodeP(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbandonedProcedureReasonObservationCodeP(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAbandonedProcedureReasonObservationCodeP(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbandonedProcedureReasonObservationCodeP(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abandonedProcedureReasonObservation The receiving '<em><b>Abandoned Procedure Reason Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAbandonedProcedureReasonObservationCodeP(AbandonedProcedureReasonObservation abandonedProcedureReasonObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ABANDONED_PROCEDURE_REASON_OBSERVATION);
			try {
				VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(abandonedProcedureReasonObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ABANDONED_PROCEDURE_REASON_OBSERVATION__ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("AbandonedProcedureReasonObservationCodeP"),
						 new Object [] { abandonedProcedureReasonObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservationCodeP", passToken);
				}
				passToken.add(abandonedProcedureReasonObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbandonedProcedureReasonObservationCode(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbandonedProcedureReasonObservationCode(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateAbandonedProcedureReasonObservationCode(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbandonedProcedureReasonObservationCode(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abandonedProcedureReasonObservation The receiving '<em><b>Abandoned Procedure Reason Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAbandonedProcedureReasonObservationCode(AbandonedProcedureReasonObservation abandonedProcedureReasonObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(abandonedProcedureReasonObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ABANDONED_PROCEDURE_REASON_OBSERVATION);
			try {
				VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(abandonedProcedureReasonObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ABANDONED_PROCEDURE_REASON_OBSERVATION__ABANDONED_PROCEDURE_REASON_OBSERVATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("AbandonedProcedureReasonObservationCode"),
						 new Object [] { abandonedProcedureReasonObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbandonedProcedureReasonObservationValue(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbandonedProcedureReasonObservationValue(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17078-9' or value.code = 'LA17079-7' or value.code = 'LA17080-5' or value.code = 'LA17081-3' or value.code = 'LA17082-1' or value.code = 'LA18204-0')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAbandonedProcedureReasonObservationValue(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbandonedProcedureReasonObservationValue(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abandonedProcedureReasonObservation The receiving '<em><b>Abandoned Procedure Reason Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAbandonedProcedureReasonObservationValue(AbandonedProcedureReasonObservation abandonedProcedureReasonObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ABANDONED_PROCEDURE_REASON_OBSERVATION);
			try {
				VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(abandonedProcedureReasonObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ABANDONED_PROCEDURE_REASON_OBSERVATION__ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("AbandonedProcedureReasonObservationValue"),
						 new Object [] { abandonedProcedureReasonObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbandonedProcedureReasonObservationValueP(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbandonedProcedureReasonObservationValueP(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAbandonedProcedureReasonObservationValueP(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abandoned Procedure Reason Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbandonedProcedureReasonObservationValueP(AbandonedProcedureReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abandonedProcedureReasonObservation The receiving '<em><b>Abandoned Procedure Reason Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAbandonedProcedureReasonObservationValueP(AbandonedProcedureReasonObservation abandonedProcedureReasonObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ABANDONED_PROCEDURE_REASON_OBSERVATION);
			try {
				VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(abandonedProcedureReasonObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ABANDONED_PROCEDURE_REASON_OBSERVATION__ABANDONED_PROCEDURE_REASON_OBSERVATION_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("AbandonedProcedureReasonObservationValueP"),
						 new Object [] { abandonedProcedureReasonObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // AbandonedProcedureReasonObservationOperations