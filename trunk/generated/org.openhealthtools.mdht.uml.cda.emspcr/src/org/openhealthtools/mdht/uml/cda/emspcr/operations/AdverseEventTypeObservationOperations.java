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

import org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Adverse Event Type Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation#validateAdverseEventTypeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation#validateAdverseEventTypeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation#validateAdverseEventTypeObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation#validateAdverseEventTypeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation#validateAdverseEventTypeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation#validateAdverseEventTypeObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdverseEventTypeObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdverseEventTypeObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventTypeObservationTemplateId(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTypeObservationTemplateId(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.90')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventTypeObservationTemplateId(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTypeObservationTemplateId(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEventTypeObservation The receiving '<em><b>Adverse Event Type Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventTypeObservationTemplateId(AdverseEventTypeObservation adverseEventTypeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVERSE_EVENT_TYPE_OBSERVATION);
			try {
				VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEventTypeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADVERSE_EVENT_TYPE_OBSERVATION__ADVERSE_EVENT_TYPE_OBSERVATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("AdverseEventTypeObservationTemplateId"),
						 new Object [] { adverseEventTypeObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventTypeObservationMoodCode(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTypeObservationMoodCode(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventTypeObservationMoodCode(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTypeObservationMoodCode(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEventTypeObservation The receiving '<em><b>Adverse Event Type Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventTypeObservationMoodCode(AdverseEventTypeObservation adverseEventTypeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVERSE_EVENT_TYPE_OBSERVATION);
			try {
				VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEventTypeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADVERSE_EVENT_TYPE_OBSERVATION__ADVERSE_EVENT_TYPE_OBSERVATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("AdverseEventTypeObservationMoodCode"),
						 new Object [] { adverseEventTypeObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventTypeObservationCodeP(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTypeObservationCodeP(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventTypeObservationCodeP(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTypeObservationCodeP(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEventTypeObservation The receiving '<em><b>Adverse Event Type Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventTypeObservationCodeP(AdverseEventTypeObservation adverseEventTypeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVERSE_EVENT_TYPE_OBSERVATION);
			try {
				VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEventTypeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADVERSE_EVENT_TYPE_OBSERVATION__ADVERSE_EVENT_TYPE_OBSERVATION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("AdverseEventTypeObservationCodeP"),
						 new Object [] { adverseEventTypeObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservationCodeP", passToken);
				}
				passToken.add(adverseEventTypeObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventTypeObservationCode(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTypeObservationCode(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67555-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventTypeObservationCode(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTypeObservationCode(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEventTypeObservation The receiving '<em><b>Adverse Event Type Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventTypeObservationCode(AdverseEventTypeObservation adverseEventTypeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(adverseEventTypeObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVERSE_EVENT_TYPE_OBSERVATION);
			try {
				VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEventTypeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADVERSE_EVENT_TYPE_OBSERVATION__ADVERSE_EVENT_TYPE_OBSERVATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("AdverseEventTypeObservationCode"),
						 new Object [] { adverseEventTypeObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventTypeObservationValue(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTypeObservationValue(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA137-2' or value.code = 'LA17059-9' or value.code = 'LA17402-1' or value.code = 'LA17403-9' or value.code = 'LA17404-7' or value.code = 'LA17405-4' or value.code = 'LA17406-2' or value.code = 'LA17407-0' or value.code = 'LA17408-8' or value.code = 'LA17409-6' or value.code = 'LA17410-4' or value.code = 'LA17411-2' or value.code = 'LA17412-0' or value.code = 'LA17413-8' or value.code = 'LA17414-6')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventTypeObservationValue(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTypeObservationValue(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEventTypeObservation The receiving '<em><b>Adverse Event Type Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventTypeObservationValue(AdverseEventTypeObservation adverseEventTypeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVERSE_EVENT_TYPE_OBSERVATION);
			try {
				VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEventTypeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADVERSE_EVENT_TYPE_OBSERVATION__ADVERSE_EVENT_TYPE_OBSERVATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("AdverseEventTypeObservationValue"),
						 new Object [] { adverseEventTypeObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventTypeObservationValueP(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTypeObservationValueP(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventTypeObservationValueP(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventTypeObservationValueP(AdverseEventTypeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEventTypeObservation The receiving '<em><b>Adverse Event Type Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventTypeObservationValueP(AdverseEventTypeObservation adverseEventTypeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVERSE_EVENT_TYPE_OBSERVATION);
			try {
				VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEventTypeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADVERSE_EVENT_TYPE_OBSERVATION__ADVERSE_EVENT_TYPE_OBSERVATION_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("AdverseEventTypeObservationValueP"),
						 new Object [] { adverseEventTypeObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // AdverseEventTypeObservationOperations