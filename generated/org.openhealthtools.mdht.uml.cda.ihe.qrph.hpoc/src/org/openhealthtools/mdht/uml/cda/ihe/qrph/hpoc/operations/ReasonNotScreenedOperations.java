/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreened;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason Not Screened</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreened#validateReasonNotScreenedTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreened#validateReasonNotScreenedClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreened#validateReasonNotScreenedMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreened#validateReasonNotScreenedCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreened#validateReasonNotScreenedCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreened#validateReasonNotScreenedText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReasonNotScreenedOperations extends ClinicalStatementOperations
{
  protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
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
  protected ReasonNotScreenedOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateReasonNotScreenedTemplateId(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateReasonNotScreenedTemplateId(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_REASON_NOT_SCREENED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.10')";

  /**
	 * The cached OCL invariant for the '{@link #validateReasonNotScreenedTemplateId(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateReasonNotScreenedTemplateId(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_REASON_NOT_SCREENED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonNotScreened The receiving '<em><b>Reason Not Screened</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateReasonNotScreenedTemplateId(ReasonNotScreened reasonNotScreened, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REASON_NOT_SCREENED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.REASON_NOT_SCREENED);
			try {
				VALIDATE_REASON_NOT_SCREENED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REASON_NOT_SCREENED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REASON_NOT_SCREENED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reasonNotScreened)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.REASON_NOT_SCREENED__REASON_NOT_SCREENED_TEMPLATE_ID,
						 HPOCPlugin.INSTANCE.getString("ReasonNotScreenedReasonNotScreenedTemplateId"),
						 new Object [] { reasonNotScreened }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateReasonNotScreenedClassCode(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateReasonNotScreenedClassCode(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_REASON_NOT_SCREENED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

  /**
	 * The cached OCL invariant for the '{@link #validateReasonNotScreenedClassCode(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateReasonNotScreenedClassCode(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_REASON_NOT_SCREENED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonNotScreened The receiving '<em><b>Reason Not Screened</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateReasonNotScreenedClassCode(ReasonNotScreened reasonNotScreened, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REASON_NOT_SCREENED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.REASON_NOT_SCREENED);
			try {
				VALIDATE_REASON_NOT_SCREENED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REASON_NOT_SCREENED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REASON_NOT_SCREENED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reasonNotScreened)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.REASON_NOT_SCREENED__REASON_NOT_SCREENED_CLASS_CODE,
						 HPOCPlugin.INSTANCE.getString("ReasonNotScreenedReasonNotScreenedClassCode"),
						 new Object [] { reasonNotScreened }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateReasonNotScreenedMoodCode(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateReasonNotScreenedMoodCode(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_REASON_NOT_SCREENED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

  /**
	 * The cached OCL invariant for the '{@link #validateReasonNotScreenedMoodCode(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateReasonNotScreenedMoodCode(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_REASON_NOT_SCREENED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonNotScreened The receiving '<em><b>Reason Not Screened</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateReasonNotScreenedMoodCode(ReasonNotScreened reasonNotScreened, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REASON_NOT_SCREENED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.REASON_NOT_SCREENED);
			try {
				VALIDATE_REASON_NOT_SCREENED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REASON_NOT_SCREENED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REASON_NOT_SCREENED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reasonNotScreened)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.REASON_NOT_SCREENED__REASON_NOT_SCREENED_MOOD_CODE,
						 HPOCPlugin.INSTANCE.getString("ReasonNotScreenedReasonNotScreenedMoodCode"),
						 new Object [] { reasonNotScreened }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateReasonNotScreenedCodeP(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateReasonNotScreenedCodeP(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_REASON_NOT_SCREENED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateReasonNotScreenedCodeP(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateReasonNotScreenedCodeP(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_REASON_NOT_SCREENED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonNotScreened The receiving '<em><b>Reason Not Screened</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateReasonNotScreenedCodeP(ReasonNotScreened reasonNotScreened, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REASON_NOT_SCREENED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.REASON_NOT_SCREENED);
			try {
				VALIDATE_REASON_NOT_SCREENED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REASON_NOT_SCREENED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REASON_NOT_SCREENED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reasonNotScreened)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.REASON_NOT_SCREENED__REASON_NOT_SCREENED_CODE_P,
						 HPOCPlugin.INSTANCE.getString("ReasonNotScreenedReasonNotScreenedCodeP"),
						 new Object [] { reasonNotScreened }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreenedCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreenedCodeP", passToken);
				}
				passToken.add(reasonNotScreened);
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateReasonNotScreenedCode(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateReasonNotScreenedCode(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_REASON_NOT_SCREENED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '410534003' or value.code = '183949008' or value.code = '183945002' or value.code = '183948000' or value.code = '397709008'))";

  /**
	 * The cached OCL invariant for the '{@link #validateReasonNotScreenedCode(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateReasonNotScreenedCode(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_REASON_NOT_SCREENED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonNotScreened The receiving '<em><b>Reason Not Screened</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateReasonNotScreenedCode(ReasonNotScreened reasonNotScreened, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreenedCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(reasonNotScreened)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REASON_NOT_SCREENED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.REASON_NOT_SCREENED);
			try {
				VALIDATE_REASON_NOT_SCREENED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REASON_NOT_SCREENED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REASON_NOT_SCREENED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reasonNotScreened)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.REASON_NOT_SCREENED__REASON_NOT_SCREENED_CODE,
						 HPOCPlugin.INSTANCE.getString("ReasonNotScreenedReasonNotScreenedCode"),
						 new Object [] { reasonNotScreened }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateReasonNotScreenedText(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Text</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateReasonNotScreenedText(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_REASON_NOT_SCREENED_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateReasonNotScreenedText(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Not Screened Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateReasonNotScreenedText(ReasonNotScreened, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_REASON_NOT_SCREENED_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonNotScreened The receiving '<em><b>Reason Not Screened</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateReasonNotScreenedText(ReasonNotScreened reasonNotScreened, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_REASON_NOT_SCREENED_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.REASON_NOT_SCREENED);
			try {
				VALIDATE_REASON_NOT_SCREENED_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REASON_NOT_SCREENED_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REASON_NOT_SCREENED_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reasonNotScreened)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.REASON_NOT_SCREENED__REASON_NOT_SCREENED_TEXT,
						 HPOCPlugin.INSTANCE.getString("ReasonNotScreenedReasonNotScreenedText"),
						 new Object [] { reasonNotScreened }));
			}
			 
			return false;
		}
		return true;
	}

} // ReasonNotScreenedOperations