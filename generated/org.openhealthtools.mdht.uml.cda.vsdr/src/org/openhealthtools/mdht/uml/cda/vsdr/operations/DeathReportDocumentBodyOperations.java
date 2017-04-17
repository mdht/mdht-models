/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults;
import org.openhealthtools.mdht.uml.cda.vsdr.CertifyingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer;
import org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral;
import org.openhealthtools.mdht.uml.cda.vsdr.DateandTimeofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody;
import org.openhealthtools.mdht.uml.cda.vsdr.Injury;
import org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus;
import org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;
import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Death Report Document Body</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyTimeofDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Timeof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyLocationOfDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Location Of Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCertifyingDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Certifying Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyMannerOfDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Manner Of Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyPregnancyStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Pregnancy Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyTobaccoUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Tobacco Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyInjury(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCauseOfDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Cause Of Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyAutopsyPerformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Performance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyAutopsyResults(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCoronerReferral(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Referral</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCoronerCaseTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Case Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyDeathLocationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Death Location Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyPronouncingDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Pronouncing Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getTimeofDeath() <em>Get Timeof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getLocationOfDeath() <em>Get Location Of Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getCertifyingDeath() <em>Get Certifying Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getMannerOfDeath() <em>Get Manner Of Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getPregnancyStatus() <em>Get Pregnancy Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getTobaccoUse() <em>Get Tobacco Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getInjury() <em>Get Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getCauseOfDeath() <em>Get Cause Of Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getAutopsyPerformance() <em>Get Autopsy Performance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getAutopsyResults() <em>Get Autopsy Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getCoronerReferral() <em>Get Coroner Referral</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getCoronerCaseTransfer() <em>Get Coroner Case Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getDeathLocationType() <em>Get Death Location Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getPronouncingDeath() <em>Get Pronouncing Death</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeathReportDocumentBodyOperations extends SectionOperations {
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
	protected DeathReportDocumentBodyOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyTemplateId(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyTemplateId(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyTemplateId(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyTemplateId(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyTemplateId(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyCode(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyCode(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '69409-1' and value.codeSystem = '2.16.840.1.113883.6.1'";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyCode(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyCode(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyCode(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyCodeP(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyCodeP(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyCodeP(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyCodeP(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyCodeP(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyText(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyText(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyText(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyText(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyText(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_TEXT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyTimeofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Timeof Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyTimeofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::DateandTimeofDeath) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyTimeofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Timeof Death</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyTimeofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyTimeofDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyTimeofDeath", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyLocationOfDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Location Of Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyLocationOfDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_LOCATION_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::LocationofDeath) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyLocationOfDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Location Of Death</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyLocationOfDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_LOCATION_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyLocationOfDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_LOCATION_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_LOCATION_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_LOCATION_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_LOCATION_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_LOCATION_OF_DEATH,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyLocationOfDeath", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyCertifyingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Certifying Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyCertifyingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::CertifyingDeath) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyCertifyingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Certifying Death</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyCertifyingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyCertifyingDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyCertifyingDeath", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyMannerOfDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Manner Of Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyMannerOfDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_MANNER_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::MannerofDeath) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyMannerOfDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Manner Of Death</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyMannerOfDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_MANNER_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyMannerOfDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_MANNER_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_MANNER_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_MANNER_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_MANNER_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_MANNER_OF_DEATH,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyMannerOfDeath", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyPregnancyStatus(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Pregnancy Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyPregnancyStatus(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::PregnancyStatus) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyPregnancyStatus(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Pregnancy Status</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyPregnancyStatus(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyPregnancyStatus(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyPregnancyStatus", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyTobaccoUse(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Tobacco Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyTobaccoUse(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::TobaccoUse) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyTobaccoUse(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Tobacco Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyTobaccoUse(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyTobaccoUse(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyTobaccoUse", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyInjury(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Injury</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyInjury(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(vsdr::Injury) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyInjury(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Injury</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyInjury(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyInjury(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_INJURY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyInjury", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyCauseOfDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Cause Of Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyCauseOfDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CAUSE_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(vsdr::DeathCausalInformation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyCauseOfDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Cause Of Death</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyCauseOfDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CAUSE_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyCauseOfDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CAUSE_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CAUSE_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CAUSE_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CAUSE_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CAUSE_OF_DEATH,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyCauseOfDeath", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyAutopsyPerformance(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Performance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyAutopsyPerformance(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::AutopsyPerformance) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyAutopsyPerformance(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Performance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyAutopsyPerformance(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyAutopsyPerformance(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyAutopsyPerformance", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyAutopsyResults(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Results</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyAutopsyResults(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::AutopsyResults) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyAutopsyResults(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Results</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyAutopsyResults(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyAutopsyResults(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyAutopsyResults", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyCoronerReferral(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Referral</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyCoronerReferral(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::CoronerReferral) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyCoronerReferral(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Referral</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyCoronerReferral(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyCoronerReferral(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyCoronerReferral", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyCoronerCaseTransfer(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Case Transfer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyCoronerCaseTransfer(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::CoronerCaseTransfer) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyCoronerCaseTransfer(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Case Transfer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyCoronerCaseTransfer(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyCoronerCaseTransfer(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyCoronerCaseTransfer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyDeathLocationType(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Death Location Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyDeathLocationType(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::DeathLocationType) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyDeathLocationType(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Death Location Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyDeathLocationType(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyDeathLocationType(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyDeathLocationType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyPronouncingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Pronouncing Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyPronouncingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::PronouncingDeath) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyPronouncingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Pronouncing Death</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeathReportDocumentBodyPronouncingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDeathReportDocumentBodyPronouncingDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
			try {
				VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deathReportDocumentBody)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathReportDocumentBodyPronouncingDeath", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
						 new Object [] { deathReportDocumentBody }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getTimeofDeath(DeathReportDocumentBody) <em>Get Timeof Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeofDeath(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TIMEOF_DEATH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::DateandTimeofDeath))->asSequence()->any(true).oclAsType(vsdr::DateandTimeofDeath)";

	/**
	 * The cached OCL query for the '{@link #getTimeofDeath(DeathReportDocumentBody) <em>Get Timeof Death</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeofDeath(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TIMEOF_DEATH__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DateandTimeofDeath getTimeofDeath(DeathReportDocumentBody deathReportDocumentBody) {
	
	
	
		if (GET_TIMEOF_DEATH__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(73));
			try {
				GET_TIMEOF_DEATH__EOCL_QRY = helper.createQuery(GET_TIMEOF_DEATH__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_TIMEOF_DEATH__EOCL_QRY);
		return (DateandTimeofDeath) query.evaluate(deathReportDocumentBody);
	}

	/**
	 * The cached OCL expression body for the '{@link #getLocationOfDeath(DeathReportDocumentBody) <em>Get Location Of Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationOfDeath(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LOCATION_OF_DEATH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::LocationofDeath))->asSequence()->any(true).oclAsType(vsdr::LocationofDeath)";

	/**
	 * The cached OCL query for the '{@link #getLocationOfDeath(DeathReportDocumentBody) <em>Get Location Of Death</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationOfDeath(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LOCATION_OF_DEATH__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  LocationofDeath getLocationOfDeath(DeathReportDocumentBody deathReportDocumentBody) {
	
	
	
		if (GET_LOCATION_OF_DEATH__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(74));
			try {
				GET_LOCATION_OF_DEATH__EOCL_QRY = helper.createQuery(GET_LOCATION_OF_DEATH__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_LOCATION_OF_DEATH__EOCL_QRY);
		return (LocationofDeath) query.evaluate(deathReportDocumentBody);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCertifyingDeath(DeathReportDocumentBody) <em>Get Certifying Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertifyingDeath(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CERTIFYING_DEATH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::CertifyingDeath))->asSequence()->any(true).oclAsType(vsdr::CertifyingDeath)";

	/**
	 * The cached OCL query for the '{@link #getCertifyingDeath(DeathReportDocumentBody) <em>Get Certifying Death</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertifyingDeath(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CERTIFYING_DEATH__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  CertifyingDeath getCertifyingDeath(DeathReportDocumentBody deathReportDocumentBody) {
	
	
	
		if (GET_CERTIFYING_DEATH__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(75));
			try {
				GET_CERTIFYING_DEATH__EOCL_QRY = helper.createQuery(GET_CERTIFYING_DEATH__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CERTIFYING_DEATH__EOCL_QRY);
		return (CertifyingDeath) query.evaluate(deathReportDocumentBody);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMannerOfDeath(DeathReportDocumentBody) <em>Get Manner Of Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMannerOfDeath(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MANNER_OF_DEATH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::MannerofDeath))->asSequence()->any(true).oclAsType(vsdr::MannerofDeath)";

	/**
	 * The cached OCL query for the '{@link #getMannerOfDeath(DeathReportDocumentBody) <em>Get Manner Of Death</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMannerOfDeath(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MANNER_OF_DEATH__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  MannerofDeath getMannerOfDeath(DeathReportDocumentBody deathReportDocumentBody) {
	
	
	
		if (GET_MANNER_OF_DEATH__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(76));
			try {
				GET_MANNER_OF_DEATH__EOCL_QRY = helper.createQuery(GET_MANNER_OF_DEATH__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_MANNER_OF_DEATH__EOCL_QRY);
		return (MannerofDeath) query.evaluate(deathReportDocumentBody);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPregnancyStatus(DeathReportDocumentBody) <em>Get Pregnancy Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyStatus(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREGNANCY_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::PregnancyStatus))->asSequence()->any(true).oclAsType(vsdr::PregnancyStatus)";

	/**
	 * The cached OCL query for the '{@link #getPregnancyStatus(DeathReportDocumentBody) <em>Get Pregnancy Status</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyStatus(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREGNANCY_STATUS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PregnancyStatus getPregnancyStatus(DeathReportDocumentBody deathReportDocumentBody) {
	
	
	
		if (GET_PREGNANCY_STATUS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(77));
			try {
				GET_PREGNANCY_STATUS__EOCL_QRY = helper.createQuery(GET_PREGNANCY_STATUS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PREGNANCY_STATUS__EOCL_QRY);
		return (PregnancyStatus) query.evaluate(deathReportDocumentBody);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTobaccoUse(DeathReportDocumentBody) <em>Get Tobacco Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTobaccoUse(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TOBACCO_USE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::TobaccoUse))->asSequence()->any(true).oclAsType(vsdr::TobaccoUse)";

	/**
	 * The cached OCL query for the '{@link #getTobaccoUse(DeathReportDocumentBody) <em>Get Tobacco Use</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTobaccoUse(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TOBACCO_USE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TobaccoUse getTobaccoUse(DeathReportDocumentBody deathReportDocumentBody) {
	
	
	
		if (GET_TOBACCO_USE__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(78));
			try {
				GET_TOBACCO_USE__EOCL_QRY = helper.createQuery(GET_TOBACCO_USE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_TOBACCO_USE__EOCL_QRY);
		return (TobaccoUse) query.evaluate(deathReportDocumentBody);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInjury(DeathReportDocumentBody) <em>Get Injury</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjury(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INJURY__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(vsdr::Injury))->asSequence()->any(true).oclAsType(vsdr::Injury)";

	/**
	 * The cached OCL query for the '{@link #getInjury(DeathReportDocumentBody) <em>Get Injury</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjury(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INJURY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Injury getInjury(DeathReportDocumentBody deathReportDocumentBody) {
	
	
	
		if (GET_INJURY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(79));
			try {
				GET_INJURY__EOCL_QRY = helper.createQuery(GET_INJURY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_INJURY__EOCL_QRY);
		return (Injury) query.evaluate(deathReportDocumentBody);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCauseOfDeath(DeathReportDocumentBody) <em>Get Cause Of Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOfDeath(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CAUSE_OF_DEATH__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(vsdr::DeathCausalInformation))->asSequence()->any(true).oclAsType(vsdr::DeathCausalInformation)";

	/**
	 * The cached OCL query for the '{@link #getCauseOfDeath(DeathReportDocumentBody) <em>Get Cause Of Death</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOfDeath(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CAUSE_OF_DEATH__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DeathCausalInformation getCauseOfDeath(DeathReportDocumentBody deathReportDocumentBody) {
	
	
	
		if (GET_CAUSE_OF_DEATH__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(80));
			try {
				GET_CAUSE_OF_DEATH__EOCL_QRY = helper.createQuery(GET_CAUSE_OF_DEATH__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CAUSE_OF_DEATH__EOCL_QRY);
		return (DeathCausalInformation) query.evaluate(deathReportDocumentBody);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAutopsyPerformance(DeathReportDocumentBody) <em>Get Autopsy Performance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutopsyPerformance(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AUTOPSY_PERFORMANCE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::AutopsyPerformance))->asSequence()->any(true).oclAsType(vsdr::AutopsyPerformance)";

	/**
	 * The cached OCL query for the '{@link #getAutopsyPerformance(DeathReportDocumentBody) <em>Get Autopsy Performance</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutopsyPerformance(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AUTOPSY_PERFORMANCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  AutopsyPerformance getAutopsyPerformance(DeathReportDocumentBody deathReportDocumentBody) {
	
	
	
		if (GET_AUTOPSY_PERFORMANCE__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(81));
			try {
				GET_AUTOPSY_PERFORMANCE__EOCL_QRY = helper.createQuery(GET_AUTOPSY_PERFORMANCE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_AUTOPSY_PERFORMANCE__EOCL_QRY);
		return (AutopsyPerformance) query.evaluate(deathReportDocumentBody);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAutopsyResults(DeathReportDocumentBody) <em>Get Autopsy Results</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutopsyResults(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AUTOPSY_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::AutopsyResults))->asSequence()->any(true).oclAsType(vsdr::AutopsyResults)";

	/**
	 * The cached OCL query for the '{@link #getAutopsyResults(DeathReportDocumentBody) <em>Get Autopsy Results</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutopsyResults(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AUTOPSY_RESULTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  AutopsyResults getAutopsyResults(DeathReportDocumentBody deathReportDocumentBody) {
	
	
	
		if (GET_AUTOPSY_RESULTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(82));
			try {
				GET_AUTOPSY_RESULTS__EOCL_QRY = helper.createQuery(GET_AUTOPSY_RESULTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_AUTOPSY_RESULTS__EOCL_QRY);
		return (AutopsyResults) query.evaluate(deathReportDocumentBody);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCoronerReferral(DeathReportDocumentBody) <em>Get Coroner Referral</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoronerReferral(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CORONER_REFERRAL__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::CoronerReferral))->asSequence()->any(true).oclAsType(vsdr::CoronerReferral)";

	/**
	 * The cached OCL query for the '{@link #getCoronerReferral(DeathReportDocumentBody) <em>Get Coroner Referral</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoronerReferral(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CORONER_REFERRAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  CoronerReferral getCoronerReferral(DeathReportDocumentBody deathReportDocumentBody) {
	
	
	
		if (GET_CORONER_REFERRAL__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(83));
			try {
				GET_CORONER_REFERRAL__EOCL_QRY = helper.createQuery(GET_CORONER_REFERRAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CORONER_REFERRAL__EOCL_QRY);
		return (CoronerReferral) query.evaluate(deathReportDocumentBody);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCoronerCaseTransfer(DeathReportDocumentBody) <em>Get Coroner Case Transfer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoronerCaseTransfer(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CORONER_CASE_TRANSFER__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::CoronerCaseTransfer))->asSequence()->any(true).oclAsType(vsdr::CoronerCaseTransfer)";

	/**
	 * The cached OCL query for the '{@link #getCoronerCaseTransfer(DeathReportDocumentBody) <em>Get Coroner Case Transfer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoronerCaseTransfer(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CORONER_CASE_TRANSFER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  CoronerCaseTransfer getCoronerCaseTransfer(DeathReportDocumentBody deathReportDocumentBody) {
	
	
	
		if (GET_CORONER_CASE_TRANSFER__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(84));
			try {
				GET_CORONER_CASE_TRANSFER__EOCL_QRY = helper.createQuery(GET_CORONER_CASE_TRANSFER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CORONER_CASE_TRANSFER__EOCL_QRY);
		return (CoronerCaseTransfer) query.evaluate(deathReportDocumentBody);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDeathLocationType(DeathReportDocumentBody) <em>Get Death Location Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathLocationType(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DEATH_LOCATION_TYPE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::DeathLocationType))->asSequence()->any(true).oclAsType(vsdr::DeathLocationType)";

	/**
	 * The cached OCL query for the '{@link #getDeathLocationType(DeathReportDocumentBody) <em>Get Death Location Type</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathLocationType(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DEATH_LOCATION_TYPE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DeathLocationType getDeathLocationType(DeathReportDocumentBody deathReportDocumentBody) {
	
	
	
		if (GET_DEATH_LOCATION_TYPE__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(85));
			try {
				GET_DEATH_LOCATION_TYPE__EOCL_QRY = helper.createQuery(GET_DEATH_LOCATION_TYPE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DEATH_LOCATION_TYPE__EOCL_QRY);
		return (DeathLocationType) query.evaluate(deathReportDocumentBody);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPronouncingDeath(DeathReportDocumentBody) <em>Get Pronouncing Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPronouncingDeath(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRONOUNCING_DEATH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::PronouncingDeath))->asSequence()->any(true).oclAsType(vsdr::PronouncingDeath)";

	/**
	 * The cached OCL query for the '{@link #getPronouncingDeath(DeathReportDocumentBody) <em>Get Pronouncing Death</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPronouncingDeath(DeathReportDocumentBody)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRONOUNCING_DEATH__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PronouncingDeath getPronouncingDeath(DeathReportDocumentBody deathReportDocumentBody) {
	
	
	
		if (GET_PRONOUNCING_DEATH__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(86));
			try {
				GET_PRONOUNCING_DEATH__EOCL_QRY = helper.createQuery(GET_PRONOUNCING_DEATH__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PRONOUNCING_DEATH__EOCL_QRY);
		return (PronouncingDeath) query.evaluate(deathReportDocumentBody);
	}

} // DeathReportDocumentBodyOperations