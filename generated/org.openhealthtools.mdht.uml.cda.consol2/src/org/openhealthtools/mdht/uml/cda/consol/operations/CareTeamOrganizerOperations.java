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
import org.eclipse.mdht.uml.cda.operations.OrganizerOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamTypeObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NoteActivity;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Team Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerCareTeamMember(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Team Member</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerCareLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerNoteActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Note Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerCareTeamTypeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Team Type Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerCareTeamMemberAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Team Member Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#getNoteActivity() <em>Get Note Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#getCareTeamTypeObservation() <em>Get Care Team Type Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#getCareTeamMemberAct() <em>Get Care Team Member Act</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CareTeamOrganizerOperations extends OrganizerOperations {

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
	protected CareTeamOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerTemplateId(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerTemplateId(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.500' and id.extension = '2019-07-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerTemplateId(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerTemplateId(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerTemplateId(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerTemplateId"),
						 new Object [] { careTeamOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerId(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerId(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerId(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerId(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerId(CareTeamOrganizer careTeamOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerId","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_ID,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerId"),
						 new Object [] { careTeamOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerCodeP(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_CODE_P,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerCodeP"),
						 new Object [] { careTeamOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '86744-0')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerCodeP(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerCodeP(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerCodeP(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerCodeP(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerCode(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerCode","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_CODE,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerCode"),
						 new Object [] { careTeamOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerStatusCodeP(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerStatusCodeP(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerStatusCodeP(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerStatusCodeP(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerStatusCodeP(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerStatusCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_STATUS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerStatusCodeP"),
						 new Object [] { careTeamOrganizer }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerStatusCodeP", passToken);
				}
				passToken.add(careTeamOrganizer);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerStatusCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerStatusCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'normal' or value.code = 'aborted' or value.code = 'active' or value.code = 'cancelled' or value.code = 'completed' or value.code = 'held' or value.code = 'new' or value.code = 'suspended' or value.code = 'nullified' or value.code = 'obsolete')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerStatusCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerStatusCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerStatusCode(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerStatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(careTeamOrganizer)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerStatusCode","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerStatusCode"),
						 new Object [] { careTeamOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerEffectiveTime(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerEffectiveTime(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerEffectiveTime(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerEffectiveTime(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerEffectiveTime(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerEffectiveTime","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerEffectiveTime"),
						 new Object [] { careTeamOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerClassCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerClassCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerClassCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerClassCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerClassCode(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerClassCode","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerClassCode"),
						 new Object [] { careTeamOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerMoodCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerMoodCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerMoodCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerMoodCode(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerMoodCode(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerMoodCode"),
						 new Object [] { careTeamOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerCareTeamMember(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Team Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerCareTeamMember(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerCareTeamMember(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Team Member</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerCareTeamMember(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerCareTeamMember(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerCareTeamMember","WARNING");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerCareTeamMember"),
						 new Object [] { careTeamOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerCareLocation(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerCareLocation(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_CARE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerCareLocation(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerCareLocation(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_ORGANIZER_CARE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerCareLocation(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerCareLocation","INFO");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_CARE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_CARE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_CARE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_CARE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_CARE_LOCATION,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerCareLocation"),
						 new Object [] { careTeamOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerNoteActivity(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Note Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerNoteActivity(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.act.oclIsUndefined() and component.act.oclIsKindOf(consol::NoteActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerNoteActivity(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Note Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerNoteActivity(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_ORGANIZER_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerNoteActivity(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerNoteActivity","INFO");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_NOTE_ACTIVITY,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerNoteActivity"),
						 new Object [] { careTeamOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerCareTeamTypeObservation(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Team Type Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerCareTeamTypeObservation(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::CareTeamTypeObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerCareTeamTypeObservation(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Team Type Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerCareTeamTypeObservation(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerCareTeamTypeObservation(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerCareTeamTypeObservation","INFO");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_CARE_TEAM_TYPE_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerCareTeamTypeObservation"),
						 new Object [] { careTeamOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerCareTeamMemberAct(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Team Member Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerCareTeamMemberAct(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.act.oclIsUndefined() and component.act.oclIsKindOf(consol::CareTeamMemberAct))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerCareTeamMemberAct(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Team Member Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerCareTeamMemberAct(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerCareTeamMemberAct(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerCareTeamMemberAct","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER_ACT,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerCareTeamMemberAct"),
						 new Object [] { careTeamOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerAuthor(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerAuthor(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerAuthor(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerAuthor(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAM_ORGANIZER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerAuthor(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerAuthor","WARNING");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_AUTHOR,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerAuthor"),
						 new Object [] { careTeamOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerIVLTSLow(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerIVLTSLow(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerIVLTSLow(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerIVLTSLow(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_CARE_TEAM_ORGANIZER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validateCareTeamOrganizerIVLTSLow(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerIVLTSLow","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_TEAM_ORGANIZER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_TEAM_ORGANIZER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_CARE_TEAM_ORGANIZER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(careTeamOrganizer);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_IVLTS_LOW,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerIVLTSLow"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerIVLTSHigh(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerIVLTSHigh(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerIVLTSHigh(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerIVLTSHigh(CareTeamOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_CARE_TEAM_ORGANIZER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizer The receiving '<em><b>Care Team Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validateCareTeamOrganizerIVLTSHigh(CareTeamOrganizer careTeamOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamOrganizerCareTeamOrganizerIVLTSHigh","INFO");
    
  	  
  	  
		if (VALIDATE_CARE_TEAM_ORGANIZER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_TEAM_ORGANIZER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_TEAM_ORGANIZER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_CARE_TEAM_ORGANIZER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(careTeamOrganizer);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAM_ORGANIZER__CARE_TEAM_ORGANIZER_IVLTS_HIGH,
						 ConsolPlugin.INSTANCE.getString("CareTeamOrganizerCareTeamOrganizerIVLTSHigh"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNoteActivity(CareTeamOrganizer) <em>Get Note Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteActivity(CareTeamOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NOTE_ACTIVITY__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NoteActivity))->asSequence()->any(true).oclAsType(consol::NoteActivity)";

	/**
	 * The cached OCL query for the '{@link #getNoteActivity(CareTeamOrganizer) <em>Get Note Activity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteActivity(CareTeamOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NOTE_ACTIVITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static NoteActivity getNoteActivity(CareTeamOrganizer careTeamOrganizer) {
	
	
	
		if (GET_NOTE_ACTIVITY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER, ConsolPackage.Literals.CARE_TEAM_ORGANIZER.getEAllOperations().get(69));
			try {
				GET_NOTE_ACTIVITY__EOCL_QRY = helper.createQuery(GET_NOTE_ACTIVITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_NOTE_ACTIVITY__EOCL_QRY);
		return (NoteActivity) query.evaluate(careTeamOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCareTeamTypeObservation(CareTeamOrganizer) <em>Get Care Team Type Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamTypeObservation(CareTeamOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CARE_TEAM_TYPE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CareTeamTypeObservation))->asSequence()->any(true).oclAsType(consol::CareTeamTypeObservation)";

	/**
	 * The cached OCL query for the '{@link #getCareTeamTypeObservation(CareTeamOrganizer) <em>Get Care Team Type Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamTypeObservation(CareTeamOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CARE_TEAM_TYPE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static CareTeamTypeObservation getCareTeamTypeObservation(CareTeamOrganizer careTeamOrganizer) {
	
	
	
		if (GET_CARE_TEAM_TYPE_OBSERVATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER, ConsolPackage.Literals.CARE_TEAM_ORGANIZER.getEAllOperations().get(70));
			try {
				GET_CARE_TEAM_TYPE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_CARE_TEAM_TYPE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CARE_TEAM_TYPE_OBSERVATION__EOCL_QRY);
		return (CareTeamTypeObservation) query.evaluate(careTeamOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCareTeamMemberAct(CareTeamOrganizer) <em>Get Care Team Member Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamMemberAct(CareTeamOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CARE_TEAM_MEMBER_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::CareTeamMemberAct))->asSequence()->any(true).oclAsType(consol::CareTeamMemberAct)";

	/**
	 * The cached OCL query for the '{@link #getCareTeamMemberAct(CareTeamOrganizer) <em>Get Care Team Member Act</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamMemberAct(CareTeamOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CARE_TEAM_MEMBER_ACT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static CareTeamMemberAct getCareTeamMemberAct(CareTeamOrganizer careTeamOrganizer) {
	
	
	
		if (GET_CARE_TEAM_MEMBER_ACT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER, ConsolPackage.Literals.CARE_TEAM_ORGANIZER.getEAllOperations().get(71));
			try {
				GET_CARE_TEAM_MEMBER_ACT__EOCL_QRY = helper.createQuery(GET_CARE_TEAM_MEMBER_ACT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CARE_TEAM_MEMBER_ACT__EOCL_QRY);
		return (CareTeamMemberAct) query.evaluate(careTeamOrganizer);
	}

} // CareTeamOrganizerOperations
