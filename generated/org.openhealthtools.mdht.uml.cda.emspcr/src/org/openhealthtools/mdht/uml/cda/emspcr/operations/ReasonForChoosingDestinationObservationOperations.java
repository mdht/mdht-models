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
import org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason For Choosing Destination Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation#validateReasonForChoosingDestinationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation#validateReasonForChoosingDestinationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation#validateReasonForChoosingDestinationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation#validateReasonForChoosingDestinationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation#validateReasonForChoosingDestinationObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation#validateReasonForChoosingDestinationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReasonForChoosingDestinationObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasonForChoosingDestinationObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForChoosingDestinationObservationTemplateId(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForChoosingDestinationObservationTemplateId(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.35')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForChoosingDestinationObservationTemplateId(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForChoosingDestinationObservationTemplateId(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonForChoosingDestinationObservation The receiving '<em><b>Reason For Choosing Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateReasonForChoosingDestinationObservationTemplateId(ReasonForChoosingDestinationObservation reasonForChoosingDestinationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.REASON_FOR_CHOOSING_DESTINATION_OBSERVATION);
			try {
				VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForChoosingDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ReasonForChoosingDestinationObservationTemplateId"),
						 new Object [] { reasonForChoosingDestinationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForChoosingDestinationObservationCodeP(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForChoosingDestinationObservationCodeP(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForChoosingDestinationObservationCodeP(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForChoosingDestinationObservationCodeP(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonForChoosingDestinationObservation The receiving '<em><b>Reason For Choosing Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateReasonForChoosingDestinationObservationCodeP(ReasonForChoosingDestinationObservation reasonForChoosingDestinationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.REASON_FOR_CHOOSING_DESTINATION_OBSERVATION);
			try {
				VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForChoosingDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ReasonForChoosingDestinationObservationCodeP"),
						 new Object [] { reasonForChoosingDestinationObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservationCodeP", passToken);
				}
				passToken.add(reasonForChoosingDestinationObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForChoosingDestinationObservationCode(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForChoosingDestinationObservationCode(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67552-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForChoosingDestinationObservationCode(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForChoosingDestinationObservationCode(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonForChoosingDestinationObservation The receiving '<em><b>Reason For Choosing Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateReasonForChoosingDestinationObservationCode(ReasonForChoosingDestinationObservation reasonForChoosingDestinationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(reasonForChoosingDestinationObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.REASON_FOR_CHOOSING_DESTINATION_OBSERVATION);
			try {
				VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForChoosingDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("ReasonForChoosingDestinationObservationCode"),
						 new Object [] { reasonForChoosingDestinationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForChoosingDestinationObservationValue(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForChoosingDestinationObservationValue(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17059-9' or value.code = 'LA17182-9' or value.code = 'LA17184-5' or value.code = 'LA17185-2' or value.code = 'LA17186-0' or value.code = 'LA17187-8' or value.code = 'LA17188-6' or value.code = 'LA17189-4' or value.code = 'LA17190-2' or value.code = 'LA17191-0' or value.code = 'LA18301-4')))";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForChoosingDestinationObservationValue(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForChoosingDestinationObservationValue(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonForChoosingDestinationObservation The receiving '<em><b>Reason For Choosing Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateReasonForChoosingDestinationObservationValue(ReasonForChoosingDestinationObservation reasonForChoosingDestinationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.REASON_FOR_CHOOSING_DESTINATION_OBSERVATION);
			try {
				VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForChoosingDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ReasonForChoosingDestinationObservationValue"),
						 new Object [] { reasonForChoosingDestinationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForChoosingDestinationObservationValueP(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForChoosingDestinationObservationValueP(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForChoosingDestinationObservationValueP(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForChoosingDestinationObservationValueP(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonForChoosingDestinationObservation The receiving '<em><b>Reason For Choosing Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateReasonForChoosingDestinationObservationValueP(ReasonForChoosingDestinationObservation reasonForChoosingDestinationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.REASON_FOR_CHOOSING_DESTINATION_OBSERVATION);
			try {
				VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForChoosingDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("ReasonForChoosingDestinationObservationValueP"),
						 new Object [] { reasonForChoosingDestinationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForChoosingDestinationObservationMoodCode(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForChoosingDestinationObservationMoodCode(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForChoosingDestinationObservationMoodCode(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForChoosingDestinationObservationMoodCode(ReasonForChoosingDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonForChoosingDestinationObservation The receiving '<em><b>Reason For Choosing Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateReasonForChoosingDestinationObservationMoodCode(ReasonForChoosingDestinationObservation reasonForChoosingDestinationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.REASON_FOR_CHOOSING_DESTINATION_OBSERVATION);
			try {
				VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForChoosingDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ReasonForChoosingDestinationObservationMoodCode"),
						 new Object [] { reasonForChoosingDestinationObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // ReasonForChoosingDestinationObservationOperations