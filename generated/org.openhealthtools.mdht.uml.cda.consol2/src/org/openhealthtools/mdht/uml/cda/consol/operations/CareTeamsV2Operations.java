/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.mdht.uml.cda.operations.SectionOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Teams V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2#validateCareTeamsV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2#validateCareTeamsV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2#validateCareTeamsV2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2#validateCareTeamsV2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2#validateCareTeamsV2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2#validateCareTeamsV2CareTeamOrganizerV2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Care Team Organizer V2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2#getCareTeamOrganizerV2s() <em>Get Care Team Organizer V2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CareTeamsV2Operations extends SectionOperations {

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
	protected CareTeamsV2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamsV2TemplateId(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsV2TemplateId(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAMS_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.500' and id.extension = '2022-06-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamsV2TemplateId(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsV2TemplateId(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAMS_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamsV2 The receiving '<em><b>Care Teams V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamsV2TemplateId(CareTeamsV2 careTeamsV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamsV2CareTeamsV2TemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAMS_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAMS_V2);
			try {
				VALIDATE_CARE_TEAMS_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAMS_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAMS_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamsV2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAMS_V2__CARE_TEAMS_V2_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("CareTeamsV2CareTeamsV2TemplateId"),
						 new Object [] { careTeamsV2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamsV2Code(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsV2Code(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAMS_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '85847-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamsV2Code(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsV2Code(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAMS_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamsV2 The receiving '<em><b>Care Teams V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamsV2Code(CareTeamsV2 careTeamsV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamsV2CareTeamsV2Code","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAMS_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAMS_V2);
			try {
				VALIDATE_CARE_TEAMS_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAMS_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAMS_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamsV2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAMS_V2__CARE_TEAMS_V2_CODE,
						 ConsolPlugin.INSTANCE.getString("CareTeamsV2CareTeamsV2Code"),
						 new Object [] { careTeamsV2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamsV2CodeP(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsV2CodeP(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAMS_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamsV2CodeP(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsV2CodeP(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAMS_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamsV2 The receiving '<em><b>Care Teams V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamsV2CodeP(CareTeamsV2 careTeamsV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamsV2CareTeamsV2CodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAMS_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAMS_V2);
			try {
				VALIDATE_CARE_TEAMS_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAMS_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAMS_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamsV2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAMS_V2__CARE_TEAMS_V2_CODE_P,
						 ConsolPlugin.INSTANCE.getString("CareTeamsV2CareTeamsV2CodeP"),
						 new Object [] { careTeamsV2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamsV2Title(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsV2Title(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAMS_V2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamsV2Title(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsV2Title(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAMS_V2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamsV2 The receiving '<em><b>Care Teams V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamsV2Title(CareTeamsV2 careTeamsV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamsV2CareTeamsV2Title","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAMS_V2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAMS_V2);
			try {
				VALIDATE_CARE_TEAMS_V2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAMS_V2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAMS_V2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamsV2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAMS_V2__CARE_TEAMS_V2_TITLE,
						 ConsolPlugin.INSTANCE.getString("CareTeamsV2CareTeamsV2Title"),
						 new Object [] { careTeamsV2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamsV2Text(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsV2Text(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAMS_V2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamsV2Text(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsV2Text(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAMS_V2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamsV2 The receiving '<em><b>Care Teams V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamsV2Text(CareTeamsV2 careTeamsV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamsV2CareTeamsV2Text","ERROR");
    
  	  
  	  
		if (VALIDATE_CARE_TEAMS_V2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAMS_V2);
			try {
				VALIDATE_CARE_TEAMS_V2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAMS_V2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAMS_V2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamsV2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAMS_V2__CARE_TEAMS_V2_TEXT,
						 ConsolPlugin.INSTANCE.getString("CareTeamsV2CareTeamsV2Text"),
						 new Object [] { careTeamsV2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamsV2CareTeamOrganizerV2(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Care Team Organizer V2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsV2CareTeamOrganizerV2(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAMS_V2_CARE_TEAM_ORGANIZER_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::CareTeamOrganizerV2))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamsV2CareTeamOrganizerV2(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Care Team Organizer V2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsV2CareTeamOrganizerV2(CareTeamsV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARE_TEAMS_V2_CARE_TEAM_ORGANIZER_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamsV2 The receiving '<em><b>Care Teams V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamsV2CareTeamOrganizerV2(CareTeamsV2 careTeamsV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CareTeamsV2CareTeamsV2CareTeamOrganizerV2","WARNING");
    
  	  
  	  
		if (VALIDATE_CARE_TEAMS_V2_CARE_TEAM_ORGANIZER_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAMS_V2);
			try {
				VALIDATE_CARE_TEAMS_V2_CARE_TEAM_ORGANIZER_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARE_TEAMS_V2_CARE_TEAM_ORGANIZER_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAMS_V2_CARE_TEAM_ORGANIZER_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamsV2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CARE_TEAMS_V2__CARE_TEAMS_V2_CARE_TEAM_ORGANIZER_V2,
						 ConsolPlugin.INSTANCE.getString("CareTeamsV2CareTeamsV2CareTeamOrganizerV2"),
						 new Object [] { careTeamsV2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCareTeamOrganizerV2s(CareTeamsV2) <em>Get Care Team Organizer V2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamOrganizerV2s(CareTeamsV2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CARE_TEAM_ORGANIZER_V2S__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::CareTeamOrganizerV2)).oclAsType(consol::CareTeamOrganizerV2)";

	/**
	 * The cached OCL query for the '{@link #getCareTeamOrganizerV2s(CareTeamsV2) <em>Get Care Team Organizer V2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamOrganizerV2s(CareTeamsV2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CARE_TEAM_ORGANIZER_V2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CareTeamOrganizerV2> getCareTeamOrganizerV2s(CareTeamsV2 careTeamsV2) {
	
	
	
		if (GET_CARE_TEAM_ORGANIZER_V2S__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.CARE_TEAMS_V2, ConsolPackage.Literals.CARE_TEAMS_V2.getEAllOperations().get(61));
			try {
				GET_CARE_TEAM_ORGANIZER_V2S__EOCL_QRY = helper.createQuery(GET_CARE_TEAM_ORGANIZER_V2S__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CARE_TEAM_ORGANIZER_V2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CareTeamOrganizerV2> result = (Collection<CareTeamOrganizerV2>) query.evaluate(careTeamsV2);
		return new BasicEList.UnmodifiableEList<CareTeamOrganizerV2>(result.size(), result.toArray());
	}

} // CareTeamsV2Operations
