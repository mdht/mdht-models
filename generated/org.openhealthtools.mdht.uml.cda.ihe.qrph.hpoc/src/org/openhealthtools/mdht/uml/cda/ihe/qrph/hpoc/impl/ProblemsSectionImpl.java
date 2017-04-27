/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.ProblemsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problems Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProblemsSectionImpl extends SectionImpl implements ProblemsSection
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ProblemsSectionImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return HPOCPackage.Literals.PROBLEMS_SECTION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ProblemsSectionOperations.validateProblemsSectionTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ProblemsSectionOperations.validateProblemsSectionCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemsSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ProblemsSectionOperations.validateProblemsSectionCodeP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ProblemsSectionOperations.validateProblemsSectionTitle(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ProblemsSectionOperations.validateProblemsSectionText(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemsSectionComponentHpocProblems(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ProblemsSectionOperations.validateProblemsSectionComponentHpocProblems(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateProblemsSectionEntryProblemConcern(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ProblemsSectionOperations.validateProblemsSectionEntryProblemConcern(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemsSection init() {
	    return Initializer.Util.init(this);
	}

		/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProblemsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ProblemsSectionImpl
