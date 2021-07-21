/**
 */
package org.hl7.security.ds4p.contentprofile.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPlugin;
import org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection;
import org.hl7.security.ds4p.contentprofile.util.CONTENTPROFILEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Markings Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection#validatePrivacyMarkingsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection#validatePrivacyMarkingsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Code</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection#validatePrivacyMarkingsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Code P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection#validatePrivacyMarkingsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Text</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection#validatePrivacyMarkingsSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Entry1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrivacyMarkingsSectionOperations extends SectionOperations {

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
	protected PrivacyMarkingsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyMarkingsSectionTemplateId(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyMarkingsSectionTemplateId(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_MARKINGS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.3251.1.5')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyMarkingsSectionTemplateId(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyMarkingsSectionTemplateId(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_MARKINGS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyMarkingsSection The receiving '<em><b>Privacy Markings Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrivacyMarkingsSectionTemplateId(PrivacyMarkingsSection privacyMarkingsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrivacyMarkingsSectionPrivacyMarkingsSectionTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_PRIVACY_MARKINGS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_MARKINGS_SECTION);
			try {
				VALIDATE_PRIVACY_MARKINGS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_MARKINGS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_MARKINGS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacyMarkingsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_MARKINGS_SECTION__PRIVACY_MARKINGS_SECTION_TEMPLATE_ID,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyMarkingsSectionPrivacyMarkingsSectionTemplateId"),
						 new Object [] { privacyMarkingsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyMarkingsSectionCode(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyMarkingsSectionCode(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_MARKINGS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '57017-6')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyMarkingsSectionCode(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyMarkingsSectionCode(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_MARKINGS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyMarkingsSection The receiving '<em><b>Privacy Markings Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrivacyMarkingsSectionCode(PrivacyMarkingsSection privacyMarkingsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrivacyMarkingsSectionPrivacyMarkingsSectionCode","WARNING");
    
  	  
  	  
		if (VALIDATE_PRIVACY_MARKINGS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_MARKINGS_SECTION);
			try {
				VALIDATE_PRIVACY_MARKINGS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_MARKINGS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_MARKINGS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacyMarkingsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_MARKINGS_SECTION__PRIVACY_MARKINGS_SECTION_CODE,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyMarkingsSectionPrivacyMarkingsSectionCode"),
						 new Object [] { privacyMarkingsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyMarkingsSectionCodeP(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyMarkingsSectionCodeP(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_MARKINGS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyMarkingsSectionCodeP(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyMarkingsSectionCodeP(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_MARKINGS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyMarkingsSection The receiving '<em><b>Privacy Markings Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrivacyMarkingsSectionCodeP(PrivacyMarkingsSection privacyMarkingsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrivacyMarkingsSectionPrivacyMarkingsSectionCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_PRIVACY_MARKINGS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_MARKINGS_SECTION);
			try {
				VALIDATE_PRIVACY_MARKINGS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_MARKINGS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_MARKINGS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacyMarkingsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_MARKINGS_SECTION__PRIVACY_MARKINGS_SECTION_CODE_P,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyMarkingsSectionPrivacyMarkingsSectionCodeP"),
						 new Object [] { privacyMarkingsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyMarkingsSectionText(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyMarkingsSectionText(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_MARKINGS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyMarkingsSectionText(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyMarkingsSectionText(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_MARKINGS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyMarkingsSection The receiving '<em><b>Privacy Markings Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrivacyMarkingsSectionText(PrivacyMarkingsSection privacyMarkingsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrivacyMarkingsSectionPrivacyMarkingsSectionText","ERROR");
    
  	  
  	  
		if (VALIDATE_PRIVACY_MARKINGS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_MARKINGS_SECTION);
			try {
				VALIDATE_PRIVACY_MARKINGS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_MARKINGS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_MARKINGS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacyMarkingsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_MARKINGS_SECTION__PRIVACY_MARKINGS_SECTION_TEXT,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyMarkingsSectionPrivacyMarkingsSectionText"),
						 new Object [] { privacyMarkingsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyMarkingsSectionEntry1(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Entry1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyMarkingsSectionEntry1(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_MARKINGS_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(contentprofile::PrivacyMarkingsEntry) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyMarkingsSectionEntry1(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Entry1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyMarkingsSectionEntry1(PrivacyMarkingsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PRIVACY_MARKINGS_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyMarkingsSection The receiving '<em><b>Privacy Markings Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrivacyMarkingsSectionEntry1(PrivacyMarkingsSection privacyMarkingsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrivacyMarkingsSectionPrivacyMarkingsSectionEntry1","INFO");
    
  	  
  	  
		if (VALIDATE_PRIVACY_MARKINGS_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_MARKINGS_SECTION);
			try {
				VALIDATE_PRIVACY_MARKINGS_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIVACY_MARKINGS_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIVACY_MARKINGS_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(privacyMarkingsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						 CONTENTPROFILEValidator.PRIVACY_MARKINGS_SECTION__PRIVACY_MARKINGS_SECTION_ENTRY1,
						 CONTENTPROFILEPlugin.INSTANCE.getString("PrivacyMarkingsSectionPrivacyMarkingsSectionEntry1"),
						 new Object [] { privacyMarkingsSection }));
			}
			 
			return false;
		}
		return true;
	}

} // PrivacyMarkingsSectionOperations
