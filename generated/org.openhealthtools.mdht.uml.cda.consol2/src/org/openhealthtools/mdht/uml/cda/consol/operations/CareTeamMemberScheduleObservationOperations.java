/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Team Member Schedule Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationEDTELValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation EDTEL Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationEDReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation ED Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CareTeamMemberScheduleObservationOperations extends ClinicalStatementOperations {

	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
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
	protected CareTeamMemberScheduleObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationTemplateId(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationTemplateId(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.500.3' and id.extension = '2019-07-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationTemplateId(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationTemplateId(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservation The receiving '<em><b>Care Team Member Schedule Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationTemplateId(
			CareTeamMemberScheduleObservation careTeamMemberScheduleObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberScheduleObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationTemplateId"),
						 new Object [] { careTeamMemberScheduleObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationCodeP(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationCodeP(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationCodeP(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationCodeP(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservation The receiving '<em><b>Care Team Member Schedule Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationCodeP(
			CareTeamMemberScheduleObservation careTeamMemberScheduleObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberScheduleObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationCodeP"),
						 new Object [] { careTeamMemberScheduleObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationCodeP", passToken);
				}
				passToken.add(careTeamMemberScheduleObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '57203-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservation The receiving '<em><b>Care Team Member Schedule Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationCode(
			CareTeamMemberScheduleObservation careTeamMemberScheduleObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(careTeamMemberScheduleObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationCode","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberScheduleObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE,
						 ConsolPlugin.INSTANCE.getString("CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationCode"),
						 new Object [] { careTeamMemberScheduleObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationText(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationText(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationText(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationText(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservation The receiving '<em><b>Care Team Member Schedule Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationText(
			CareTeamMemberScheduleObservation careTeamMemberScheduleObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationText","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberScheduleObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEXT,
						 ConsolPlugin.INSTANCE.getString("CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationText"),
						 new Object [] { careTeamMemberScheduleObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationValue(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationValue(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationValue(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationValue(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservation The receiving '<em><b>Care Team Member Schedule Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationValue(
			CareTeamMemberScheduleObservation careTeamMemberScheduleObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationValue","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberScheduleObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_VALUE,
						 ConsolPlugin.INSTANCE.getString("CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationValue"),
						 new Object [] { careTeamMemberScheduleObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationClassCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationClassCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationClassCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationClassCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservation The receiving '<em><b>Care Team Member Schedule Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationClassCode(
			CareTeamMemberScheduleObservation careTeamMemberScheduleObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationClassCode","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberScheduleObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationClassCode"),
						 new Object [] { careTeamMemberScheduleObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationMoodCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationMoodCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationMoodCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationMoodCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservation The receiving '<em><b>Care Team Member Schedule Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationMoodCode(
			CareTeamMemberScheduleObservation careTeamMemberScheduleObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberScheduleObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationMoodCode"),
						 new Object [] { careTeamMemberScheduleObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservation The receiving '<em><b>Care Team Member Schedule Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationStatusCodeP(
			CareTeamMemberScheduleObservation careTeamMemberScheduleObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationStatusCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberScheduleObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationStatusCodeP"),
						 new Object [] { careTeamMemberScheduleObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationStatusCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationStatusCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationStatusCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationStatusCode(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationStatusCodeP(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationStatusCodeP(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationStatusCodeP(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationStatusCodeP(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservation The receiving '<em><b>Care Team Member Schedule Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationStatusCode(
			CareTeamMemberScheduleObservation careTeamMemberScheduleObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationStatusCode","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberScheduleObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationStatusCode"),
						 new Object [] { careTeamMemberScheduleObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationEDTELValue(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation EDTEL Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationEDTELValue(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->excluding(null)->select(isNullFlavorUndefined()).reference->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not value.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationEDTELValue(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation EDTEL Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationEDTELValue(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservation The receiving '<em><b>Care Team Member Schedule Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCareTeamMemberScheduleObservationEDTELValue(
			CareTeamMemberScheduleObservation careTeamMemberScheduleObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationEDTELValue","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(careTeamMemberScheduleObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_EDTEL_VALUE,
						 ConsolPlugin.INSTANCE.getString("CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationEDTELValue"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationEDReference(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation ED Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationEDReference(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((reference.oclIsUndefined() or reference.isNullFlavorUndefined()) implies (not reference.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationEDReference(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation ED Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationEDReference(CareTeamMemberScheduleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservation The receiving '<em><b>Care Team Member Schedule Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCareTeamMemberScheduleObservationEDReference(
			CareTeamMemberScheduleObservation careTeamMemberScheduleObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationEDReference","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(careTeamMemberScheduleObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_ED_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("CareTeamMemberScheduleObservationCareTeamMemberScheduleObservationEDReference"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // CareTeamMemberScheduleObservationOperations
